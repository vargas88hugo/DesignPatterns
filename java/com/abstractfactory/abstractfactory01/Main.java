package com.abstractfactory.abstractfactory01;

import com.abstractfactory.abstractfactory01.Instance.Capacity;
import com.abstractfactory.abstractfactory01.amazon.AwsResourceFactory;
import com.abstractfactory.abstractfactory01.google.GoogleResourceFactory;

/**
 * This is a program that implements the Abstract Factory. It is implemented in 
 * the main class with the constructor and the createServer method. The Abstract
 * Factory is a derived pattern of Factory Method and varies in the number of
 * instances created. 
 * @author Hugo Vargas
 * @version 1.0 2020-01-01
 */
public class Main {

	private ResourceFactory factory;
	
	public Main(ResourceFactory factory) {
		this.factory = factory;
	}
	
	public Instance createServer(Instance.Capacity cap, int storageMib) {
		Instance instance = factory.createInstance(cap);
		Storage storage = factory.createStorage(storageMib);
		instance.attachStorage(storage);
		return instance;
	}
	
	public static void main(String[] args) {
    	Main aws = new Main(new AwsResourceFactory());
    	Instance i1 = aws.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
    	
    	System.out.println("***************************************");
    	Main gcp = new Main(new GoogleResourceFactory());
    	i1 = gcp.createServer(Capacity.micro, 20480);
    	i1.start();
    	i1.stop();
	}

}
