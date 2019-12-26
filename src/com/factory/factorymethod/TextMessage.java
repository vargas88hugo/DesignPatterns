package com.factory.factorymethod;

/**
 * This class is a product
 * @author Hugo Vargas
 */
public class TextMessage extends Message {

	@Override
	public String getContent() {
		return "Text";
	}

}
