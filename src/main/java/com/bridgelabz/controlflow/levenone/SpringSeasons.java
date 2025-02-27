package com.bridgelabz.controlflow.levenone;

public class SpringSeasons {
    public static void main(String[] args) {
        String date = "5:5"; // hardcoded value
        String[] parts = date.split(":");

        int month = Integer.parseInt(parts[0]); // spliting month from date
        int day = Integer.parseInt(parts[1]); // spliting day from date

        // checking the condition for spring
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
