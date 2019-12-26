package com.factory.factorymethod;

public class TextMessageCreator extends MessageCreator {
	
	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
