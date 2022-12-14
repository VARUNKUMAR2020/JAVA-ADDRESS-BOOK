package com.addressbook;

public class Contacts {
    String firstName, lastName, city, state, email, phoneNumber, zipCode;

    //constructor
    public Contacts(String firstName, String lastName, String phoneNumber, String email, String city, String state,
            String zipCode) {
        this.firstName = firstName;// The this keyword can be used to refer current class instance variable
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    // Setter method --Encapsulation
    public void setFirstname(String firstName) {
		this.firstName = firstName;
	}

	public void setLastname(String lastName) {
		this.lastName = lastName;
	}

	public void setPhone(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipcode(String zipCode) {
		this.zipCode = zipCode;
	}
    
    //The method does override or implement a method declared
    @Override

    //Returns a string representation of the object.
    public String toString() {
        return "First Name : '" + firstName + "', Last Name : '" + lastName + "', Phone Number : '" + phoneNumber
                + "', email ID : '" + email + "', City : '" + city + "', State : '" + state + "', Zipcode : '" + zipCode
                + "'";
    }

}
