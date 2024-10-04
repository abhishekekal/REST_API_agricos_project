package com.agricos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricos.entity.Category;
import com.agricos.repository.CategoryRepository;
@Service
public class CategoryService {
	 @Autowired(required = true)
	    private CategoryRepository categoryRepository;

	 
	 public Category saveCategory(Category category) {
	        return categoryRepository.save(category);
	    }
	    public List<Category> getAllCategories() {
	        return categoryRepository.findAll();
	    }

	    public Category updateCategory(Long id, Category categoryDetails) {
	        Category category = categoryRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Category not found for this id :: " + id));

	        category.setName(categoryDetails.getName());
	        category.setDescription(categoryDetails.getDescription());

	        return categoryRepository.save(category);
	    }

	    public void deleteCategory(Long id) {
	        Category category = categoryRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Category not found for this id :: " + id));
	        
	        categoryRepository.delete(category);
	    }

	    public Category getCategoryById(Long id) {
	        return categoryRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Category not found for this id :: " + id));
	    }

	    
}
