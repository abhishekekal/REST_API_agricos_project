package com.agricos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agricos.entity.Product;
import com.agricos.service.ProductService;
@RestController
@RequestMapping("/api/products")
public class ProductController {
	   @Autowired
	    private ProductService productService;

	    @GetMapping
	    public List<Product> getAllProducts() {
	        return productService.getAllProducts();
	    }
	    @GetMapping("/{id}")
	    public Product getProductById(@PathVariable Long id) {
	        return productService.getProductById(id);
	    }

	    @PostMapping
	    public Product createProduct(@RequestBody Product product) {
	        return productService.saveProduct(product);
	    }
	    @PutMapping("/{id}")
	    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
	        return productService.updateProduct(id, productDetails);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteProduct(@PathVariable Long id) {
	        productService.deleteProduct(id);
	    }
}
