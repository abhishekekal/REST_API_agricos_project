package com.agricos.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Category {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String description;

	    @OneToMany(mappedBy = "category")
	    private List<Product> products;

		public Category(Long id, String name, String description, List<Product> products) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.products = products;
		}

		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}

		@Override
		public String toString() {
			return "Category [id=" + id + ", name=" + name + ", description=" + description + ", products=" + products
					+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
					+ "]";
		}
	    
	    
	    
	    
	    
	    
}
