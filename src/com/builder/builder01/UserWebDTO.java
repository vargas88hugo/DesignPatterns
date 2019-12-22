package com.builder.builder01;

/**
 * This class is the product in the program. It creates instances on the
 * builder process to the client
 * @author Hugo Vargas
 */
public class UserWebDTO implements UserDTO {

private String name;
	
	private String address;
	
	private String age;

	public UserWebDTO(String name, String address, String age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "name=" + name + "\nage=" + age + "\naddress=" + address ;
	}
}
