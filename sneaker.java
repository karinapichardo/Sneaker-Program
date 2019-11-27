package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Customer {
    String name;
    double sneakerChoice;
    int quantity;
    double taxRate = 0.08;
    double taxAmount;
    double total;

    Customer(String nameInput, double sneakerChoiceInput, int quantityInput) {
        this.name = nameInput;
        this.sneakerChoice = sneakerChoiceInput;
        this.quantity = quantityInput;

        if (sneakerChoiceInput == 1) {
            sneakerChoice = 550.50;
        }
        if (sneakerChoiceInput == 2) {
            sneakerChoice = 250.50;
        }
        if (sneakerChoiceInput == 3) {
            sneakerChoice = 175.25;
        }
    }

    double CalculateCharges() {
        DecimalFormat df = new DecimalFormat(".00");
        double cost;
        cost = sneakerChoice * quantity;
        taxAmount = cost * taxRate;
        total = cost + taxAmount;
        System.out.println("Cost: $" + df.format(cost));
        System.out.println("Tax Amount: $" + df.format(taxAmount));
        return total;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Online Sneaker Store!");

        System.out.println("Please Enter Your Name: ");
        String name = scan.nextLine();
        System.out.println("Hi " + name + ", Welcome!");

        System.out.println("Enter The Sneaker You'd Like to Purchase - \"1: Nike, 2: Adidas, 3: Sketchers\" ");
        int sneakerChoice = scan.nextInt();

        System.out.println("Enter How Many Pair of Sneakers You'd Like to Purchase: ");
        int quantity = scan.nextInt();

        Customer c1 = new Customer(name, sneakerChoice, quantity);

        System.out.println("Total Charges: $" + c1.CalculateCharges());
        System.out.println("Thank You For Shopping!");

    }
}
