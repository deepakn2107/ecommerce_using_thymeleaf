package com.npci.thymeleaf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.npci.thymeleaf.entity.Product;
import com.npci.thymeleaf.service.EcommerceService;

@Controller
@RequestMapping("/ecommerce")
public class EcommerceController {

	@Autowired
	EcommerceService ecommService;

	@GetMapping("/productList")
	public String displayAllProduct(Model model) {
		List<Product> product = ecommService.findAll();
		model.addAttribute("PRODUCT", product);
		return "ecommerceUI/ecomProductList.html";

	}
	
	

	@GetMapping("/addProduct")
	public String addProduct(Model model) {
		model.addAttribute("PRODUCT", new Product());
		return "ecommerceUI/ecomAddProduct.html";
	}

	@PostMapping("/save")
	public String save(@ModelAttribute("PRODUCT") Product product) {

		ecommService.save(product);

		return "redirect:/ecommerce/productList";
	}

	@GetMapping("/updateProduct")
	public String updateForm(@RequestParam("productid") Integer id, Model model) {
		Product product = ecommService.findById(id);
		model.addAttribute("PRODUCT", product);

		return "ecommerceUI/ecomAddProduct.html";
	}

	@GetMapping("/deleteProduct")
	public String deleteById(@RequestParam("productid") Integer id) {
		ecommService.deleteById(id);
		return "redirect:/ecommerce/productList";
	}

}
