package com.addressbook;
import java.util.*;

public class AddressBook {
    static Scanner input = new Scanner(System.in);
	static List<Contacts> contactsList;
	private static String firstName, lastName, city, state, email, phoneNumber, zipCode;

	private static void newContact() {
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
	}
    public static void main(String[] args) {
        System.out.println("Welcome to Address-Book :)");

        //creation of array list
        contactsList = new ArrayList<>();
		System.out.println("Add new Contact :\n");
		newContact();// method called
		Contacts contacts = new Contacts(firstName, lastName, phoneNumber, email, city, state, zipCode);
		contactsList.add(contacts);//storing the values in the array
		System.out.println("\nContact Added to the Address Book :\n");
		System.out.println(contacts);
    }
}
