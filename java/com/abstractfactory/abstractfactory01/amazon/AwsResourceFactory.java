package com.abstractfactory.abstractfactory01.amazon;

import com.abstractfactory.abstractfactory01.Instance;
import com.abstractfactory.abstractfactory01.Instance.Capacity;
import com.abstractfactory.abstractfactory01.ResourceFactory;
import com.abstractfactory.abstractfactory01.Storage;

public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}

}
