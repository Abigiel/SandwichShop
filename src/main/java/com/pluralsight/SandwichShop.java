package com.pluralsight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.print("What size sandwich would you like? (1 or 2)");

        int size= myScanner.nextInt();
        double price = 0;
        if (size == 1){
            price = 5.45;
        } else if (size==2) {
            price = 8.95;
        } else {
            System.out.println("Invalid response. Select size 1 or 2.");
        }


        System.out.print("How old are you?");

        int age= myScanner.nextInt();

        if (age <= 17){
            price -= 0.1*price;
        } else if (age >= 65) {
            price -= 0.2*price;
        }
        System.out.println("The price of your sandwich is $" + price);
    }
}
