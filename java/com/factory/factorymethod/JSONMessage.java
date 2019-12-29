package com.factory.factorymethod;

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
