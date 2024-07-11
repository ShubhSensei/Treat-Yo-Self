package com.TreatYoSelf.FoodDelivery.repository;

import com.TreatYoSelf.FoodDelivery.domain.OrderItem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
    // find by order id
    List<OrderItem> findByOrderId(Long orderId);

    // find order by name
    List<OrderItem> findByName(String name);
}
