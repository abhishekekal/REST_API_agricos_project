package com.agricos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricos.entity.Order;
import com.agricos.repository.OrderRepository;

@Service
public class OrderService {
	 @Autowired
	    private OrderRepository orderRepository;

	    public List<Order> getAllOrders() {
	        return orderRepository.findAll();
	    }
	    public Order getOrderById(Long id) {
	        return orderRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Order not found for this id :: " + id));
	    }
	    public Order saveOrder(Order order) {
	        return orderRepository.save(order);
	    }
	    
	    
	    public Order updateOrder(Long id, Order orderDetails) {
	        Order order = orderRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Order not found for this id :: " + id));
	        
	        order.setOrderDate(orderDetails.getOrderDate());
	        order.setProduct(orderDetails.getProduct());
	        order.setCustomer(orderDetails.getCustomer());
	        order.setQuantity(orderDetails.getQuantity());
	        order.setStatus(orderDetails.getStatus());
	        return orderRepository.save(order);
	    }

	    public void deleteOrder(Long id) {
	        Order order = orderRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Order not found for this id :: " + id));
	        
	        orderRepository.delete(order);
	    }
	    
	    
}
