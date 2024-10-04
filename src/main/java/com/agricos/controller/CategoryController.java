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

import com.agricos.entity.Category;
import com.agricos.service.CategoryService;
@RestController
@RequestMapping("/api/categories")
public class CategoryController {
	@Autowired
	    private CategoryService categoryService;

		@GetMapping
	    public List<Category> getAllCategories() {
	        return categoryService.getAllCategories();
	    }

		
		   @GetMapping("/{id}")
		    public Category getCategoryById(@PathVariable Long id) {
		        return categoryService.getCategoryById(id);
		    }
	    @PostMapping
	    public Category createCategory(@RequestBody Category category) {
	        return categoryService.saveCategory(category);
	    }
	    @PutMapping("/{id}")
	    public Category updateCategory(@PathVariable Long id, @RequestBody Category categoryDetails) {
	        return categoryService.updateCategory(id, categoryDetails);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteCategory(@PathVariable Long id) {
	        categoryService.deleteCategory(id);
	    }
	    
	    
	    
	    
}
