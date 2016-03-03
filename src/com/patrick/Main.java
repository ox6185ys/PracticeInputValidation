package com.patrick;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cups = 0;
        boolean isNumber;// Validation from Absolute Zero on youtube.
        do {System.out.println("How many cups of coffee did you sell today?");
            if (scanner.hasNextInt()) {
                cups = scanner.nextInt();
                isNumber = true;
            }else {
                System.out.println("Please enter an integer.");
                isNumber = false;
                scanner.next();
            }
        } while (!isNumber);

        double price = 0;
        do {System.out.println("What does a cup of coffee cost?");
            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                isNumber = true;
            }else {
                System.out.println("Please enter a valid price. ");
                isNumber = false;
                scanner.next();
            }
        } while (!isNumber);
        double coffSales = cupsMoney(cups , price);

        System.out.println("How many cups of hot chocolate did you sell today?");
        cups = scanner.nextInt();

        System.out.println("What does a cup of hot chocolate cost?");
        price = scanner.nextDouble();
        double chocSales = cupsMoney(cups , price);

        System.out.println("How many cups of tea did you sell today?");
        cups = scanner.nextInt();

        System.out.println("What does a cup of tea cost?");
        price = scanner.nextDouble();
        double teaSales = cupsMoney(cups , price);

        System.out.println("How many cups of cappuccino did you sell today?");
        cups = scanner.nextInt();

        System.out.println("What does a cup of cappuccino cost?");
        price = scanner.nextDouble();
        double capSales = cupsMoney(cups , price);

        System.out.println("Revenue for the day is ?");
        System.out.println( capSales + teaSales + chocSales  + coffSales);

        scanner.close();
    }
    private static double cupsMoney(int cups, double price) {
        double drinkMoney = cups * price;
        return drinkMoney;
    }
}
