package com.Lortnoc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PAB_IO {

    public static void PAB() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<personalAddressBook> PAB_ArrayLists = new ArrayList<>();
        personalAddressBook PAB = new personalAddressBook(null, null, null, null); // Constructor with default parameters set to "NULL"

        while (true) {
            System.out.println("Insert First Name: ");
            String firstName = scanner.nextLine();
            PAB.setFirstName(firstName);

            System.out.println("Insert Last Name: ");
            String lastName = scanner.nextLine();
            PAB.setLastName(lastName);

            System.out.println("Please type the number to select gender: " + "\n" + "1. MALE" + "\n" + "2. FEMALE");
            int genderSelection = scanner.nextInt();

            switch (genderSelection) {
                case 1 -> PAB.setGender(Gender.MALE);
                case 2 -> PAB.setGender(Gender.FEMALE);
                default -> PAB.setGender(Gender.UNKNOWN);
            }

            System.out.println("Insert Phone Number: ");
            scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            PAB.setPhoneNumber(phoneNumber);

            PAB_ArrayLists.add(new personalAddressBook(PAB.getFirstName(), PAB.getLastName(), PAB.getGender(), PAB.getPhoneNumber()));

            System.out.println("Type (exit) to stop or type anything to continue");
            String EndMethodOption = scanner.nextLine();

            if (EndMethodOption.toLowerCase().contains("exit")) {

                System.out.println("Record has been saved...");

                for (personalAddressBook output : PAB_ArrayLists) {

                    try {
                        BufferedWriter importPAB = new BufferedWriter(new FileWriter("PAB_Database.dat", true)); // Append "true" to not overwrite the file.
                        importPAB.write(output + "\n"); // Added "\n" to make a new line into the file.
                        importPAB.close();
                    } catch (Exception e) {
                        System.out.println("Could not save file");
                    }
                }
                break;
            }
        }
    }

    public static void ReadPAB() {
        try {
            BufferedReader exportPAB = new BufferedReader(new FileReader("PAB_Database.dat"));
            String output;
            while ((output = exportPAB.readLine()) != null) {
                System.out.println(output);
            }
        } catch (Exception e) {
            System.out.println("Could not read from file");
        }
    }


}
