package com.bridgelabz.objectorienteddesign.ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer; // Association with Customer
    private List<Product> products; // Aggregation with Product
    private double total;

    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.total = 0.0;
    }

    // Add product to order (aggregation)
    public void addProduct(Product product) {
        products.add(product);
        total += product.getPrice();
    }

    // Remove product from order
    public void removeProduct(Product product) {
        if (products.remove(product)) {
            total -= product.getPrice();
        }
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotal() {
        return total;
    }

    // Display order details
    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName() + " (" + customer.getCustomerId() + ")");
        System.out.println("Products:");
        if (products.isEmpty()) {
            System.out.println("  No products in this order.");
        } else {
            for (Product product : products) {
                System.out.println("  " + product);
            }
        }
        System.out.printf("Total: $%.2f%n", total);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products); // Return a copy for encapsulation
    }
}