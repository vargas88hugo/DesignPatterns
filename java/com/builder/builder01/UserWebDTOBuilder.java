package com.builder.builder01;

import java.time.LocalDate;
import java.time.Period;

/**
 * This is the abstract builder class. It is responsible
 * for providing methods that allow the user to build objects
 * with the different parts of the product
 * @author Hugo Vargs
 */
public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private UserWebDTO dto;
	
	/**
	 * This method returns the first name 
	 */
	@Override
	public UserDTOBuilder withFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * This method returns the last name
	 */
	@Override
	public UserDTOBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * This method uses the Period class to calculate the age of the user
	 * and return it
	 */
	@Override
	public UserDTOBuilder withBirthday(LocalDate date) {
		Period ageInYears = Period.between(date, LocalDate.now());
		age = Integer.toString(ageInYears.getYears());
		return this;
	}

	/**
	 * This method returns the address object as a String
	 */
	@Override
	public UserDTOBuilder withAddress(Address address) {
		this.address = address.getHouseNumber() + ", " + address.getStreet()
						+ "\n" + address.getCity() + "\n" + address.getState()
						+ " " + address.getZipcode();
		return this;
	}

	/**
	 * This is the method that assembles the final product
	 */
	@Override
	public UserDTO build() {
		dto = new UserWebDTO(firstName + " " + lastName, address, age);
		return dto;
	}

	/**
	 * This method is optional and allow us to fetch already build object
	 */
	@Override
	public UserDTO getUserDTO() {
		return dto;
	}

}
