package com.Lortnoc;

import java.util.Scanner;

public class readData {

    public static void main() {
        openAddressBookGUI();
        openAddressBookMethod();
    }

    private static void openAddressBookMethod() {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                int userOpenAddressBookOptions = scanner.nextInt();

                switch (userOpenAddressBookOptions) {
                    case 1 -> PAB_IO.ReadPAB();
                    case 2 -> BAB_IO.ReadBAB();
                    case 3 -> {
                        Main.mainMenuGUI();
                        Main.mainMenuMethod();
                    }
                    default -> System.out.println("Please select options from 1 - 3: ");
                }
                if (userOpenAddressBookOptions > 0 && userOpenAddressBookOptions <= 3) {
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Letters are not a valid answer, please restart the program and try again.");
        }
    }

    private static void openAddressBookGUI() {
        System.out.println("========================");
        System.out.println("1. Open Personal Address Book");
        System.out.println("2. Open Business Address Book");
        System.out.println("3. Go Back to Main Menu" + "\n");
        System.out.println("Type 1 - 3 to choose options: ");
        System.out.println("========================");
    }
}