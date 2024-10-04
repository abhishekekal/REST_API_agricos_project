package com.agricos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agricos.entity.Customer;
import com.agricos.repository.CustomerRepository;

@Service
public class CustomerService {
	  @Autowired
	    private CustomerRepository customerRepository;

	    public List<Customer> getAllCustomers() {
	        return customerRepository.findAll();
	    }
	    public Customer getCustomerById(Long id) {
	        return customerRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Customer not found for this id :: " + id));
	    }

	    public Customer saveCustomer(Customer customer) {
	        return customerRepository.save(customer);
	    }

	    public Customer updateCustomer(Long id, Customer customerDetails) {
	        Customer customer = customerRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Customer not found for this id :: " + id));

	        customer.setName(customerDetails.getName());
	        customer.setEmail(customerDetails.getEmail());
	        customer.setPhone(customerDetails.getPhone());
	        customer.setAddress(customerDetails.getAddress());

	        return customerRepository.save(customer);
	    }

	    public void deleteCustomer(Long id) {
	        Customer customer = customerRepository.findById(id)
	                .orElseThrow(() -> new RuntimeException("Customer not found for this id :: " + id));

	        customerRepository.delete(customer);
	    }
}
