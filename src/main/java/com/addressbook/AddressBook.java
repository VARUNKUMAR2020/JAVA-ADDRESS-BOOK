package com.addressbook;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address-Book :)");

        // creating new class for adding contact
        Contacts contacts = new Contacts("Varun", "Kumar", "9567776443", "varunvenkat2020@gmail.com", "Chennai",
                "Tamilnadu", "632103");
        contacts.show();// calling the method to display
    }
}
