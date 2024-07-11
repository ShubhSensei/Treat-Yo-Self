package com.TreatYoSelf.FoodDelivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("orders")
public class OrderController {
    @GetMapping("order")
    public String getAllOrders(){
        return  "These are your orders";
    }
}
