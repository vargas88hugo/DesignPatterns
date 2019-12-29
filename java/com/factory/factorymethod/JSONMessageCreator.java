package com.factory.factorymethod;

public class JSONMessageCreator extends MessageCreator {

	@Override
	protected Message createMessage() {
		return new JSONMessage();
	}
}
