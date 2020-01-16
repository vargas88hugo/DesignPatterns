package com.factory.factorymethod;

import com.factory.factorymethod.message.JSONMessage;
import com.factory.factorymethod.message.Message;

public class JSONMessageCreator extends MessageCreator {

	// It returns an instance of the JSON message class
	@Override
	protected Message createMessage() {
		return new JSONMessage();
	}
}
