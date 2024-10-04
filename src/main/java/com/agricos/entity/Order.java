package com.agricos.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    private int quantity;
    private Date orderDate;
    private String status;
    
    
    
    
    
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long id, Customer customer, Product product, int quantity, Date orderDate, String status) {
		super();
		this.id = id;
		this.customer = customer;
		this.product = product;
		this.quantity = quantity;
		this.orderDate = orderDate;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customer=" + customer + ", product=" + product + ", quantity=" + quantity
				+ ", orderDate=" + orderDate + ", status=" + status + ", getId()=" + getId() + ", getCustomer()="
				+ getCustomer() + ", getProduct()=" + getProduct() + ", getQuantity()=" + getQuantity()
				+ ", getOrderDate()=" + getOrderDate() + ", getStatus()=" + getStatus() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
    
    
}
