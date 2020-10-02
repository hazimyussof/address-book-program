package com.Lortnoc;

import java.util.Scanner;

public class importData {

    public static void main() {
        addressBookGUI();
        addressBookMethod();
    }

    private static void addressBookMethod() {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                int userAddressBookOptions = scanner.nextInt();

                switch (userAddressBookOptions) {
                    case 1 -> PAB_IO.PAB();
                    case 2 -> BAB_IO.BAB();
                    case 3 -> {
                        Main.mainMenuGUI();
                        Main.mainMenuMethod();
                    }
                    default -> System.out.println("Please select options from 1 - 3: ");
                }
                if (userAddressBookOptions > 0 && userAddressBookOptions <= 3) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Letters are not a valid answer, please restart the program and try again.");
        }
    }

    private static void addressBookGUI() {
        System.out.println("========================");
        System.out.println("1. Personal Address Book");
        System.out.println("2. Business Address Book");
        System.out.println("3. Go Back to Main Menu" + "\n");
        System.out.println("Type 1 - 3 to choose options: ");
        System.out.println("========================");
    }


}