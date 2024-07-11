package com.TreatYoSelf.FoodDelivery.repository;

import com.TreatYoSelf.FoodDelivery.domain.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MenuItemRepository extends JpaRepository<MenuItem, Long>{
    
    // find by menu item id
    List<MenuItem> findByMenuItemId(Long id);

    // find by name
    List<MenuItem> findByMenuName(String name);
}
