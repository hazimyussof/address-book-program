package com.Lortnoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class BAB_IO {

    public static void BAB() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<businessAddressBook> BAB_ArrayLists = new ArrayList<>();
        businessAddressBook BAB = new businessAddressBook(null, null, null, null, null); // Constructor with default parameters set to "NULL")

        while (true) {
            System.out.println("Insert First Name: ");
            String firstName = scanner.nextLine();
            BAB.setFirstName(firstName);

            System.out.println("Insert Last Name: ");
            String lastName = scanner.nextLine();
            BAB.setLastName(lastName);

            System.out.println("Please type the number to select gender: " + "\n" + "1. MALE" + "\n" + "2. FEMALE");
            int genderSelection = scanner.nextInt();

            switch (genderSelection) {
                case 1 -> BAB.setGender(Gender.MALE);
                case 2 -> BAB.setGender(Gender.FEMALE);
                default -> BAB.setGender(Gender.UNKNOWN);
            }

            System.out.println("Insert Phone Number: ");
            scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            BAB.setPhoneNumber(phoneNumber);

            System.out.println("Insert Company Name: ");
            String companyNumber = scanner.nextLine();
            BAB.setCompanyName(companyNumber);

            BAB_ArrayLists.add(new businessAddressBook(BAB.getFirstName(), BAB.getLastName(), BAB.getGender(), BAB.getPhoneNumber(), BAB.getCompanyName()));

            System.out.println("Type (exit) to stop or type anything to continue");
            String EndMethodOption = scanner.nextLine();

            if (EndMethodOption.toLowerCase().contains("exit")) {

                System.out.println("Record has been saved...");

                for (businessAddressBook output : BAB_ArrayLists) {

                    try {
                        BufferedWriter importBAB = new BufferedWriter(new FileWriter("BAB_Database.dat", true)); // Append "true" to not overwrite the file.
                        importBAB.write(output + "\n"); // Added "\n" to make a new line into the file.
                        importBAB.close();
                    } catch (Exception e) {
                        System.out.println("Could not save file");
                    }
                }
                break;
            }
        }
    }

    public static void ReadBAB() {
        try {
            BufferedReader exportBAB = new BufferedReader(new FileReader("BAB_Database.dat"));
            String output;
            while ((output = exportBAB.readLine()) != null) {
                System.out.println(output);
            }
        } catch (Exception e) {
            System.out.println("Could not read from file");
        }
    }
}
