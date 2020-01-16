package com.factory.factorymethod;

import com.factory.factorymethod.message.Message;

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

	// This class is abstract and is define in any subclass of this
	protected abstract Message createMessage();
	
}
