package com.builder.builder01;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// User creation
		User user = new User();
		user.setBirthday(LocalDate.of(1988, 12, 01));
		user.setFirstName("Hugo");
		user.setLastName("Vargas");
		Address address = new Address();
		address.setHouseNumber("154");
		address.setStreet("Tintal");
		address.setCity("Bogota");
		address.setState("Cundinamarca");
		address.setZipcode("110111");
		user.setAddress(address);
		
		// Builder Creation
		UserDTOBuilder builder = new UserWebDTOBuilder();
		
		// The director method creates a new product
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);

	}

	/**
	 * This is the method Director of the Builder Program. It uses method chaining
	 * to return the final product 
	 * @param builder	Object that assembles the product
	 * @param user		Entity of the product to be assembled
	 * @return 			The builder instance
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
			   .withAddress(user.getAddress())
			   .withBirthday(user.getBirthday())
			   .build();
	}
}
