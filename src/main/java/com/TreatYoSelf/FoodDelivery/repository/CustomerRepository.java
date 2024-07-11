package com.TreatYoSelf.FoodDelivery.repository;

import com.TreatYoSelf.FoodDelivery.domain.Customer;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
    // // Find a customer by their email address (unique)
    Optional<Customer> findByEmail(String email);
}
