package org.springboot.productinventory.controller;

import java.util.List;

import org.springboot.productinventory.entity.Product;
import org.springboot.productinventory.entity.ResponseStructure;
import org.springboot.productinventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping(value = "/productCreated")
	public ResponseEntity<ResponseStructure<Product>> createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
	
	@GetMapping(value = "/allProduct")
	public ResponseEntity<ResponseStructure<List<Product>>> getAllProduct(){
		return productService.getAllProduct();
	}
	
	@PutMapping(value = "/updateProduct/{id}")
	public ResponseEntity<ResponseStructure<Product>> updateProductById(@RequestBody Product product, @PathVariable long id){
		return productService.updateProductById(product, id);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteById(@PathVariable long id) {
		return productService.deleteById(id);
	}
}
