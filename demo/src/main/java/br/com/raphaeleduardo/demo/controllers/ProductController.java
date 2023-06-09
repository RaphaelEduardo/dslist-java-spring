package br.com.raphaeleduardo.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.raphaeleduardo.demo.entities.Product;
import br.com.raphaeleduardo.demo.repositories.ProductRepository;

@RestController 
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> getObjects() {
		List<Product> list = productRepository.findAll();
		return list;
	}	
}
