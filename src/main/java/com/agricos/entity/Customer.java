package com.agricos.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String email;
	    private String phone;
	    private String address;

	    @OneToMany(mappedBy = "customer")
	    private List<Order> orders;
	    
	    
	    
	    
	    
	    

		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Customer(Long id, String name, String email, String phone, String address, List<Order> orders) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.address = address;
			this.orders = orders;
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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public List<Order> getOrders() {
			return orders;
		}

		public void setOrders(List<Order> orders) {
			this.orders = orders;
		}

		@Override
		public String toString() {
			return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address="
					+ address + ", orders=" + orders + ", getId()=" + getId() + ", getName()=" + getName()
					+ ", getEmail()=" + getEmail() + ", getPhone()=" + getPhone() + ", getAddress()=" + getAddress()
					+ ", getOrders()=" + getOrders() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ ", toString()=" + super.toString() + "]";
		}
	    
	    
	    
	    
	    
}
