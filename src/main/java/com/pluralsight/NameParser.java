package com.pluralsight;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String input = scanner.nextLine();

        // Trim leading and trailing spaces
        input = input.trim();

        String[] nameParts = input.split(" ");

        // Initialize variables for first, middle, and last names
        String firstName = "";
        String middleName = "(none)";
        String lastName = "";

        if (nameParts.length == 1) {
            // Only one part entered, assume it's the last name
            lastName = nameParts[0];
        } else if (nameParts.length == 2) {
            // Two parts entered, assume first and last name
            firstName = nameParts[0];
            lastName = nameParts[1];
        } else if (nameParts.length >= 3) {
            // Three or more parts entered, assume first, middle, and last name
            firstName = nameParts[0];
            middleName = nameParts[1];
            lastName = nameParts[nameParts.length - 1];
        }

        // Display the parsed name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

        scanner.close();
    }
}
