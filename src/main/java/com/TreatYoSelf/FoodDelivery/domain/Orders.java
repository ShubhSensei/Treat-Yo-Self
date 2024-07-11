package com.TreatYoSelf.FoodDelivery.domain;

import java.util.List;
import jakarta.persistence.*;

// Responsibilities:
//     Receives order placement requests from the API Gateway.
//     Validates order data and checks for restaurant availability.
//     Persists order information in the database.
//     Sends order notifications to restaurants via the message queue.
//     Updates order status based on events from restaurants and delivery providers.
// API Endpoints (Examples):
//     POST /orders: Place a new order.
//     GET /orders/{orderId}: Get order details.
//     PUT /orders/{orderId}/status: Update order status.

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer; // person who placed the order

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItem; // Items in the order

    private String orderStatus; // // PENDING, PREPARING, DELIVERING, COMPLETED, etc.

     // ... other fields like deliveryAddress, orderTime, totalAmount, etc.

    // Constructors, getters, setters
}
