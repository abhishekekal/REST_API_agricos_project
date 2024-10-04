package com.agricos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricos.entity.Product;
import com.agricos.repository.ProductRepository;
@Service
public class ProductService {
	  @Autowired
	    private ProductRepository productRepository;

	    public List<Product> getAllProducts() {
	        return productRepository.findAll();
	    }
	    public Product getProductById(Long id) {
	        return productRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Product not found for this id :: " + id));
	    }

	    public Product saveProduct(Product product) {
	        return productRepository.save(product);
	    }
	    
	    public Product updateProduct(Long id, Product productDetails) {
	        Product product = productRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Product not found for this id :: " + id));
	        
	        product.setName(productDetails.getName());
	        product.setInStock(productDetails.getisInStock());
	        product.setPrice(productDetails.getPrice());
	        product.setCategory(productDetails.getCategory());
	        
	        return productRepository.save(product);
	    }

	    public void deleteProduct(Long id) {
	        Product product = productRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Product not found for this id :: " + id));
	        
	        productRepository.delete(product);
	    }

}
