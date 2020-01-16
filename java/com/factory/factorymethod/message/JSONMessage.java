package com.factory.factorymethod.message;

/**
 * This class is a product
 * @author Hugo Vargas
 */
public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON\": []}";
	}

}
