package com.builder.builder01;

import java.time.LocalDate;

/**
 * This class is an entity of the logic. It gives a persistence and
 * can be connected to a database
 * @author Hugo Vargas
 */
public class User {
	private String firstName;
	private String lastName;
	private LocalDate birthday;
	private Address address;
	
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
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
}
