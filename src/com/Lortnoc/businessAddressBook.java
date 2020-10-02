package com.Lortnoc;

public class businessAddressBook {

    private String firstName;
    private String lastName;
    private Gender gender;
    private String phoneNumber;
    private String companyName;

    public businessAddressBook(String firstName, String lastName, Gender gender, String phoneNumber, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.companyName = companyName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() { return gender; }
    public void setGender(Gender gender) { this.gender = gender; }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "businessAddressBook " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", companyName='" + companyName + '\'';
    }
}
