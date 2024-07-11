package com.TreatYoSelf.FoodDelivery.repository;

import com.TreatYoSelf.FoodDelivery.domain.Orders;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRespository extends JpaRepository<Orders, Long>{
    
    // find all orders by customers
    List<Orders> findByCustomerId(Long customerId);

    // Find all orders with a specific status (e.g., "PENDING")
    List<Orders> findByOrderStatus(String orderStatus);
}
