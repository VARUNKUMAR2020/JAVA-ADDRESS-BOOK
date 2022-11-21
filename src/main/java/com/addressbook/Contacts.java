package com.addressbook;

public class Contacts {
    String firstName, lastName, city, state, email, phoneNumber, zipCode;

	public Contacts(String firstName, String lastName, String phoneNumber, String email, String city, String state,
			String zipCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public void show() {
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name  : " + lastName);
		System.out.println("Phone Number : " + phoneNumber);
		System.out.println("Email-ID : " + email);
		System.out.println("City  : " + city);
		System.out.println("State : " + state);
		System.out.println("Zip Code : " + zipCode);
	}

}
