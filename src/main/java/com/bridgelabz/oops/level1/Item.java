package com.bridgelabz.oops.level1;

public class Item {
    private int itemCode;
    private String itemName;
    private double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: $" + price);
    }

    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 75000.00);
        item1.displayDetails();
        int quantity = 2;
        System.out.println("Total Cost for " + quantity + " items: $" + item1.calculateTotalCost(quantity));
    }
}
