package com.cisco.prj.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.prj.entity.Product;
import com.cisco.prj.service.OrderService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private OrderService service;
	
	@GetMapping()
	public @ResponseBody List<Product> getProducts() {
		return service.getProducts();
	}
	
	@PostMapping()
	public @ResponseBody Product addProduct(@RequestBody Product p) {
		return service.addProduct(p);
	}
	
}
