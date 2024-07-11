package com.TreatYoSelf.FoodDelivery.domain;

import java.util.List;
import jakarta.persistence.*;

// Responsibilities:
//     Manages customer profiles and order history.
//     Provides endpoints for customers to view their orders and update their information.
// API Endpoints (Examples):
//     GET /customers/{customerId}/orders: Get a customer's order history.
//     PUT /customers/{customerId}: Update customer information.

@Entity
@Table(name = "customers")
public class Customer {
    @Id
//     Purpose: This annotation designates the field within your entity class that serves as the unique identifier (primary key) for each record in the corresponding database table.
//     Example: In a Customer entity, the id field would likely be marked with @Id as it uniquely identifies each customer.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//     Because you've specified GenerationType.IDENTITY, the JPA provider delegates the task of generating unique IDs to the underlying database.
//     The database's identity column mechanism (often an auto-incrementing integer column) automatically assigns the next available ID to each customer.

    private String name;
    private String email;
    private Long number;
    private String address;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> order;

// This attribute specifies the name of the field in the Order entity that serves as the foreign key referencing the Customer. In other words, it tells Hibernate (or your JPA provider) that the "customer" field in the Order entity is the owner of this relationship.
// cascade = CascadeType.ALL:

// This attribute defines cascading operations. With CascadeType.ALL, any operation you perform on the Customer entity (persist, merge, remove, refresh) will automatically be cascaded to all associated Order entities.
// Examples:
// If you delete a Customer, all their associated Orders will also be deleted.
// If you update a Customer, any changes will be reflected in their related Orders.

    // constructors, getters, setters
}
