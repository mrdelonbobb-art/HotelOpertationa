package com.pluralsight;

import java.util.Scanner;

public class TheApp {
    public static void main(String[] args) {
Room KINGroom = new Room("KINGroom",1,139,false,false,true);
Room DoubleBed = new Room("DoubleBed",2,124,false,false,false);
Room BasicRoom = new Room("BasicRoom",1,80,false,false,false);
        Scanner scanner = new Scanner(System.in);
        System.out.println("welcome to our hotel! What room would you like?");
        System.out.println("1.Basic");
        System.out.println("2.Double Bed");
        System.out.println("3. KING Suite");
        System.out.println("Choice:");
        String choice = scanner.nextLine().trim();

        if (choice.equals("1")) {
            System.out.println("The Basic room includes one full sized bed and costs $80 per night.");
        } else if (choice.equals("2")) {
            System.out.println("The Double Bed room includes two full sized beds and costs $124 per night");
        } else if (choice.equals("3")) {
            System.out.println("The King Suite includes a king sized bed with a balcony and costs $139 per night");
        } else System.out.println("please select a room");

    }
}
