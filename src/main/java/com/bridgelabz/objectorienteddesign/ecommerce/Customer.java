package com.bridgelabz.objectorienteddesign.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<Order> orders; // Association with Order

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Place an order (association)
    public Order placeOrder(String orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    // Display customer's orders
    public void displayOrders() {
        System.out.println("Customer: " + name + " (" + customerId + ")");
        System.out.println("Orders:");
        if (orders.isEmpty()) {
            System.out.println("  No orders placed.");
        } else {
            for (Order order : orders) {
                order.displayOrder();
                System.out.println(); // Separator between orders
            }
        }
    }

    public List<Order> getOrders() {
        return new ArrayList<>(orders); // Return a copy for encapsulation
    }
}