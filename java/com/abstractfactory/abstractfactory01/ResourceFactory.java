package com.abstractfactory.abstractfactory01;

/**
 * Abstract factory where defines the products
 */
public interface ResourceFactory {
	
	Instance createInstance(Instance.Capacity capacity);
	
	Storage createStorage(int capMib);
}
