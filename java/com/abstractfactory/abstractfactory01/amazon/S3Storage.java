package com.abstractfactory.abstractfactory01.amazon;

import com.abstractfactory.abstractfactory01.Storage;

public class S3Storage implements Storage {

	public S3Storage(int capacityInMib) {
		System.out.println("Allocated " + capacityInMib + " on S3.");
	}
	
	@Override
	public String getId() {
		return "S31";
	}

	@Override
	public String toString() {
		return "S3 Storage";
	}
}
