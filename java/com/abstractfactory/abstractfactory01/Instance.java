package com.abstractfactory.abstractfactory01;

/**
 * Abstract Product of the program
 */
public interface Instance {
	
	enum Capacity {
		micro,
		small,
		large
	}
	
	void start();
	
	void attachStorage(Storage storage);
	
	void stop();

}
