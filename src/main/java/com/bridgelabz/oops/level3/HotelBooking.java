package com.bridgelabz.oops.level3;
class HotelBooking {
    // Private attributes for encapsulation
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this("Unknown Guest", "Standard", 1); // Calls parameterized constructor
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Getters for controlled access
    public String getGuestName() {
        return guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getNights() {
        return nights;
    }

    // Setter with validation
    public void setNights(int nights) {
        if (nights > 0) {
            this.nights = nights;
        } else {
            System.out.println("Number of nights must be positive.");
        }
    }

    // Method to calculate total cost (assuming prices for different room types)
    public double calculateTotalCost() {
        double ratePerNight;
        switch (roomType.toLowerCase()) {
            case "deluxe":
                ratePerNight = 200.0;
                break;
            case "suite":
                ratePerNight = 350.0;
                break;
            default:
                ratePerNight = 100.0; // Standard room
        }
        return ratePerNight * nights;
    }

    // Method to display booking details
    public void displayBookingInfo() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookingInfo();

        // Using parameterized constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
        booking2.displayBookingInfo();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookingInfo();

        // Modifying number of nights using setter
        booking3.setNights(5);
        System.out.println("Updated Booking Info:");
        booking3.displayBookingInfo();
    }
}
