package com.builder.builder02;

import java.time.LocalDate;
import java.time.Period;

/**
 * This implementation of the Builder Pattern is more compact than
 * the previous one. It has an inner static class that is the builder, 
 * the outer class not has a constructor and has a private setters
 * that are used in the builder inner class.   
 * @author Hugo Vargas
 *
 */
public class UserDTO {
	
	private String name;
	
	private String address;
	
	private String age;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	private void setAge(String age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}
	
	/**
	 * This method is optional and provides instances of the builder method. 
	 * We can use the class builder directly instead of this method.
	 * @return	An instance of the builder method
	 */
	public static UserDTOBuilder getBuilder() {
		return new UserDTOBuilder();
	}
	
	/**
	 * This is the inner class that provides the builder constructor of the
	 * program. It has a methods that returns instances of the class and makes
	 * it possible ot use method chaining
	 * @author Hugo Vargas
	 */
	public static class UserDTOBuilder {
		
		private String firstName;
		
		private String lastName;
		
		private String age;
		
		private String address;
		
		private UserDTO userDTO;
		
		public UserDTOBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public UserDTOBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public UserDTOBuilder withBirthday(LocalDate date) {
			age = Integer.toString(Period.between(date, LocalDate.now()).getYears());
			return this;
		}
		
		public UserDTOBuilder withAddress(Address address) {
			this.address = address.getHouseNumber() + " " +address.getStreet()
						+ "\n"+address.getCity()+", "+address.getState()+" "+address.getZipcode(); 

			return this;
		}
		
		/**
		 * This is the method that assembles the final product
		 * @return	An instance of the outer class 
		 */
		public UserDTO build() {
			this.userDTO = new UserDTO();
			userDTO.setName(firstName+" " + lastName);
			userDTO.setAddress(address);
			userDTO.setAge(age);
			return this.userDTO;
		}
		
		/**
		 * This method is optional and allow us to fetch already build object
		 * @return An instace of the outer class
		 */
		public UserDTO getUserDTO() {
			return this.userDTO;
		}
	}
}