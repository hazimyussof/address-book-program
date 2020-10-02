package com.Lortnoc;

public class personalAddressBook {

    private String firstName;
    private String lastName;
    private Gender gender;
    private String phoneNumber;

    public personalAddressBook(String firstName, String lastName, Gender gender, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() { return this.firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public String getPhoneNumber() { return phoneNumber; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    @Override
    public String toString() {
        return "personalAddressBook: " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'';
    }
}


