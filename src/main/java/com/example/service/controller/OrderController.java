package com.example.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders/health")
    public String health() {
        return "Order Service is UP";
    }

    @GetMapping("/orders")
    public String getOrders() {
        return "List of orders!";
    }
}
