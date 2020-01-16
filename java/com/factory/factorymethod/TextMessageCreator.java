package com.factory.factorymethod;

import com.factory.factorymethod.message.Message;
import com.factory.factorymethod.message.TextMessage;

public class TextMessageCreator extends MessageCreator {

	// It returns an instance of the Text Message class
	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
