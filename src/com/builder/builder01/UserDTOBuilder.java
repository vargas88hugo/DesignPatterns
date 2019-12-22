package com.builder.builder01;

import java.time.LocalDate;

/**
 * This is the abstract builder interface. It is responsible
 * for providing methods that allow the user to build objects
 * with the different parts of the product
 * @author Hugo Vargs
 */
public interface UserDTOBuilder {
	
	/**
	 * Method to build part of the product and return references to
	 * the builder itself 
	 */
	UserDTOBuilder withFirstName(String firstName) ;

	/**
	 * Method to build part of the product and return references to
	 * the builder itself 
	 */
	UserDTOBuilder withLastName(String lastName);

	/**
	 * Method to build part of the product and return references to
	 * the builder itself 
	 */
	UserDTOBuilder withBirthday(LocalDate date);

	/**
	 * Method to build part of the product and return references to
	 * the builder itself 
	 */
	UserDTOBuilder withAddress(Address address);

	/**
	 * This is the method that assembles the final product
	 */
	UserDTO build();

	/**
	 * This method is optional and allow us to fetch already build object
	 */
	UserDTO getUserDTO();

}
