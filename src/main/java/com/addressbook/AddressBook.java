package com.addressbook;

import java.util.*;

public class AddressBook {
    static Scanner input = new Scanner(System.in);
    static List<Contacts> contactsList;
    private static String firstName, lastName, city, state, email, phoneNumber, zipCode;

    public static void main(String[] args) {
        System.out.println("----Welcome to Address Book Program----");
        contactsList = new ArrayList<>();
        showMenu();
    }

    // method to Show the choice
    private static void showMenu() {
        System.out.println("\n Please Select The Option ");
        System.out.println("1. Show All Contacts.");
        System.out.println("2. Add A New Contact.");
        System.out.println("3. Edit A Contact.");
        System.out.println("4. Delete A Contact.");
        System.out.println("5. Exit");
        int selection = input.nextInt();
        switch (selection) {
            case 1:
                showContact();
            case 2:
                addContact();
            case 3:
                updateContact();
            case 4:
                deleteContact();
            case 5:
                System.exit(0);
            default:
                showMenu();
        }
    }

    // method to delete
    private static void deleteContact() {
        System.out.println("Enter the Name to Delete the contact details: ");
        String name = input.next();
        for (Contacts contacts : contactsList) {
            if (contacts.firstName.equals(name)) {
                contactsList.remove(contacts);
                System.out.println("Deleted from the Address Book.");
                showMenu();
            }
        }
    }

    // method to show contact:
    private static void showContact() {
        System.out.println("\n--Contacts--");
        int count = 1;
        for (Contacts contacts : contactsList) {
            System.out.println("Contact Number " + count + ": " + contacts + "\n");
            count++;
        }
        showMenu();
    }

    // method to add contact
    private static void addContact() {
        System.out.println("\n--Add new Contact--");
        System.out.print("Enter First Name : ");
        firstName = input.next();
        System.out.print("Enter Last Name : ");
        lastName = input.next();
        System.out.print("Enter Phone : ");
        phoneNumber = input.next();
        System.out.print("Enter Email : ");
        email = input.next();
        System.out.print("Enter City : ");
        city = input.next();
        System.out.print("Enter State : ");
        state = input.next();
        System.out.print("Enter Zip : ");
        zipCode = input.next();

        // Each Address Book has a unique Name
        boolean existing = false;
        for (Contacts contacts : contactsList) {
            existing = contacts.firstName.equals(firstName) && contacts.lastName.equals(lastName);
        }
        if (!existing) {
            Contacts contacts = new Contacts(firstName, lastName, phoneNumber, email, city, state, zipCode);
            contactsList.add(contacts);
            System.out.println("\n Contact Added to the Address Book :");
            System.out.println(contacts);
        } else {
            System.out.println("\n This Name already exists in the Address Book :");
        }
    }

    // method to update contact
    private static void updateContact() {
        System.out.println("\nEnter the Name of the Person to update the contact details: ");
        String name = input.next();
        for (Contacts contacts : contactsList) {
            if (contacts.firstName.equals(name)) {
                System.out.println("\n--Add new Contact--\n");
                System.out.print("Enter First Name : ");
                firstName = input.next();
                System.out.print("Enter Last Name : ");
                lastName = input.next();
                System.out.print("Enter Phone : ");
                phoneNumber = input.next();
                System.out.print("Enter Email : ");
                email = input.next();
                System.out.print("Enter City : ");
                city = input.next();
                System.out.print("Enter State : ");
                state = input.next();
                System.out.print("Enter Zip : ");
                zipCode = input.next();
                contacts.setFirstname(firstName);
                contacts.setLastname(lastName);
                contacts.setPhone(phoneNumber);
                contacts.setEmail(email);
                contacts.setCity(city);
                contacts.setState(state);
                contacts.setZipcode(zipCode);
                System.out.println("\n: Contact Updated :\n");
            }
        }
        showMenu();
    }
}
