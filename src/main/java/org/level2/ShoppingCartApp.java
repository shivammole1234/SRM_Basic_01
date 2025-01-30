package org.level2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class CartItem {
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void displayItem() {
        System.out.println(itemName + " - $" + price + " x " + quantity + " = $" + getTotalPrice());
    }
}

class ShoppingCart {
    private List<CartItem> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(quantity + " x " + itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        Iterator<CartItem> iterator = cartItems.iterator();
        while (iterator.hasNext()) {
            CartItem item = iterator.next();
            if (item.getItemName().equalsIgnoreCase(itemName)) {
                iterator.remove();
                System.out.println(item.getItemName() + " removed from cart.");
                return;
            }
        }
        System.out.println("Item not found in cart.");
    }

    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Shopping Cart:");
        for (CartItem item : cartItems) {
            item.displayItem();
        }
        displayTotalCost();
    }
}

public class ShoppingCartApp {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem("Laptop", 75000.00, 1);
        cart.addItem("Mouse", 1500.00, 2);
        cart.displayCart();

        cart.removeItem("Mouse");
        cart.displayCart();
    }
}
