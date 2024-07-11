package com.TreatYoSelf.FoodDelivery.repository;

import com.TreatYoSelf.FoodDelivery.domain.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long>{
    
    // find by name
    List<Restaurant> findByName(String name);
}
