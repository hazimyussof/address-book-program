package com.Lortnoc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mainMenuGUI();
        mainMenuMethod();
    }

    public static void mainMenuMethod() {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                int userOptions = scanner.nextInt();

                switch (userOptions) {
                    case 1 -> importData.main();
                    case 2 -> readData.main();
                    case 3 -> System.out.println("Program will now quit");
                    default -> System.out.println("Please select options from 1 - 3: ");
                }
                if (userOptions > 0 && userOptions <= 3) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Letters are not a valid answer, please restart the program and try again.");
        }
    }

    public static void mainMenuGUI() {
        System.out.println("========================================================");
        System.out.println("Program: ADDRESS BOOK FOR PERSONAL AND BUSINESS CONTACTS" + "\n");
        System.out.println("1. Insert contact into address book");
        System.out.println("2. Open address book");
        System.out.println("3. Exit Application" + "\n");
        System.out.println("Please type 1 - 3 to choose your options: ");
        System.out.println("========================================================");
    }
}