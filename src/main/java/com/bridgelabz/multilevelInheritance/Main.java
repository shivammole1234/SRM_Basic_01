package com.bridgelabz.multilevelInheritance;

public class Main {
    public static void main(String[] args) {

        Order order = new Order(1001,"2025-03-05");

        System.out.println("🔹 Order Details:");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        System.out.println("\n------------------------\n");

        // Order shipped
        ShippedOrder shippedOrder = new ShippedOrder(1002, "2025-03-02", "TRK123456");
        System.out.println("🔹 Shipped Order Details:");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        System.out.println("\n------------------------\n");

        // Order delivered
        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "2025-02-28", "TRK654321", "2025-03-03");
        System.out.println("🔹 Delivered Order Details:");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
