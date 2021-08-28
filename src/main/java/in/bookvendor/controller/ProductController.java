package in.bookvendor.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.bookvendor.model.Product;
import in.bookvendor.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	private IProductService productService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}

	@RequestMapping(value = "/list-products", method = RequestMethod.GET)
	public String showProducts(ModelMap model) {
		String name = getLoggedInUserName(model);
		model.put("products", productService.getProductsByCode(name));
		// model.put("products", service.retrieveProducts(name));
		return "list-products";
	}

	private String getLoggedInUserName(ModelMap model) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal instanceof UserDetails) {
			return ((UserDetails) principal).getUsername();
		}

		return principal.toString();
	}

	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public String showAddProductPage(ModelMap model) {
		model.addAttribute("product", new Product());
		return "product";
	}

	@RequestMapping(value = "/delete-product", method = RequestMethod.GET)
	public String deleteProduct(@RequestParam long id) {
		productService.deleteProduct(id);
		// service.deleteProduct(id);
		return "redirect:/list-products";
	}

	@RequestMapping(value = "/update-product", method = RequestMethod.GET)
	public String showUpdateProductPage(@RequestParam long id, ModelMap model) {
		Product product = productService.getProductById(id).get();
		model.put("product", product);
		return "product";
	}

	@RequestMapping(value = "/update-product", method = RequestMethod.POST)
	public String updateProduct(ModelMap model, @Valid Product product, BindingResult result) {

		if (result.hasErrors()) {
			return "product";
		}

		product.setProductName(getLoggedInUserName(model));
		productService.updateProduct(product);
		return "redirect:/list-products";
	}

	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public String addProduct(ModelMap model, @Valid Product product, BindingResult result) {

		if (result.hasErrors()) {
			return "product";
		}

		product.setProductName(getLoggedInUserName(model));
		productService.saveProduct(product);
		return "redirect:/list-products";
	}
}
