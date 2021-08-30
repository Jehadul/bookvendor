package in.bookvendor.open.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.bookvendor.open.service.IOpenService;

@Controller
public class OpenController {

	@Autowired
	private IOpenService openService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String publicHomePage(ModelMap model) {
		model.put("productList", openService.getAllProducts());
		return "public/index";
	}
	
	
}
