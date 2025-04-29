package com.bridgelabz.multilevelInheritance;


public class ShippedOrder extends Order  {
    protected String trackingNumber;

    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void displayOrderDetails(){
        super.displayOrderDetails();
        System.out.println("Tracking Number:- "+trackingNumber);
    }

    @Override
    public String getOrderStatus(){
        return "Order places";
    }
}
