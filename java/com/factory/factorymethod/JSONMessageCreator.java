package com.factory.factorymethod;

public class JSONMessageCreator extends MessageCreator {

	// It returns an instance of the JSON message class
	@Override
	protected Message createMessage() {
		return new JSONMessage();
	}
}
