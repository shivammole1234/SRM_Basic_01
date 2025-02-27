package com.bridgelabz.objectorienteddesign.ecommerce;

public class EcommerceMain{
    public static void main(String[] args) {
        // Create customers
        Customer cust1 = new Customer("C001", "Priya Sharma");
        Customer cust2 = new Customer("C002", "Rohan Gupta");

        // Create products
        Product prod1 = new Product("P001", "Laptop", 999.99);
        Product prod2 = new Product("P002", "Smartphone", 499.99);
        Product prod3 = new Product("P003", "Headphones", 79.99);

        // Customer places orders
        Order order1 = cust1.placeOrder("O001");
        order1.addProduct(prod1);
        order1.addProduct(prod3);

        Order order2 = cust1.placeOrder("O002");
        order2.addProduct(prod2);

        Order order3 = cust2.placeOrder("O003");
        order3.addProduct(prod2);
        order3.addProduct(prod3);

        // Display customer orders
        System.out.println("=== Customer Orders ===");
        cust1.displayOrders();
        cust2.displayOrders();

        // Demonstrate independence of products (aggregation)
        System.out.println("\n=== Products Still Exist Independently ===");
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
    }
}