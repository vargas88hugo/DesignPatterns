package com.abstractfactory.abstractfactory01.google;

import com.abstractfactory.abstractfactory01.Instance;
import com.abstractfactory.abstractfactory01.Instance.Capacity;
import com.abstractfactory.abstractfactory01.ResourceFactory;
import com.abstractfactory.abstractfactory01.Storage;

public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputerEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}

}
