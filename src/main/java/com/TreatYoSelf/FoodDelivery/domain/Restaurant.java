package com.TreatYoSelf.FoodDelivery.domain;

import java.sql.Time;
import jakarta.persistence.*;

// Responsibilities:
//     Manages restaurant profiles, menus, and operating hours.
//     Receives order notifications from the message queue.
//     Updates order status (e.g., accepted, preparing, ready).
//     Sends notifications to the Order Microservice when an order is ready.
// API Endpoints (Examples):
//     GET /restaurants: Get a list of restaurants.
//     GET /restaurants/{restaurantId}/menu: Get a restaurant's menu.

@Entity
@Table(name = "restaurants")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private String name;
    private String address;
    private Time openingHour;
    private Time closingHour;
    

    @OneToMany(mappedBy = "restaurant")
    private MenuItem menuItem;

    // getters & setters
}
