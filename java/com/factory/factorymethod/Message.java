package com.factory.factorymethod;

/**
 * This is the super class of the products
 * @author Hugo Vargas
 */
public abstract class Message {
	
	public abstract String getContent();
	
	/**
	 * This method is used in the abstract class creator
	 */
	public void addDefaultHeaders() {
		//Adds some default headers
	}
	
	/**
	 * This method is used in the abstract class creator
	 */
	public void encrypt() {
		//# Has some code to encrypt the content
	}
}
