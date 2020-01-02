package com.abstractfactory.abstractfactory01.google;

import com.abstractfactory.abstractfactory01.Storage;

public class GoogleCloudStorage implements Storage {

	public GoogleCloudStorage(int capacityInMib) {
		System.out.println("Allocated " + capacityInMib + "on Google Cloud Storage");
	}
	
	@Override
	public String getId() {
		return "gcpcs1";
	}

	@Override
	public String toString() {
		return "Google Cloud Storage";
	}

}
