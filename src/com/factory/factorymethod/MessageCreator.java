package com.factory.factorymethod;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 * @author Hugo Vargas
 */
public abstract class MessageCreator {
	
	public Message getMessage() {
		Message msg = createMessage();
		
		msg.addDefaultHeaders();
		msg.encrypt();
		
		return msg;
	}

	protected abstract Message createMessage();
	
}
