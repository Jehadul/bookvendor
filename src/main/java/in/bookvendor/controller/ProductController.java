package in.bookvendor.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.bookvendor.model.Product;
import in.bookvendor.service.IProductService;

@Controller
public class ProductController {
	ModelAndView mav = new ModelAndView();

	@Autowired
	private IProductService productService;

	@GetMapping("/list-products")
	public ModelAndView showProducts(@ModelAttribute("product") Product product) {
		mav = new ModelAndView("product/list-products");
		mav.addObject("products", productService.getAllProducts());
		return mav;
	}

	@GetMapping("/add-product")
	public ModelAndView createProduct(@ModelAttribute("product") Product product) {
		mav = new ModelAndView("product/product");
		return mav;
	}

	@RequestMapping(value = "/delete-product")
	public String deleteProduct(@RequestParam long id) {
		productService.deleteProduct(id);
		return "redirect:/list-products";
	}

	@GetMapping(value = "/update-product")
	public ModelAndView editProduct(@RequestParam long id, @ModelAttribute("product") Product product) {
		mav = new ModelAndView("product/product");
		mav.addObject("product", productService.getProductById(id).get());
		return mav;
	}

	@PostMapping(value = "/add-product")
	public String saveOrUpdateProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if (result.hasErrors()) 
			return "product/product";

		if (product.getId() != null) {
			productService.updateProduct(product);
		}else {
			productService.saveProduct(product);
		}
		
		return "redirect:/list-products";
	}
}
