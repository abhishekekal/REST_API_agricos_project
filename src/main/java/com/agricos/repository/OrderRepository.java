package com.agricos.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.agricos.entity.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
