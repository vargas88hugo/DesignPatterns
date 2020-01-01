package com.factory.factorymethod;

public class TextMessageCreator extends MessageCreator {

	// It returns an instance of the Text Message class
	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
