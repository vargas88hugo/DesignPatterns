package com.singleton.singleton01;

/**
 * Using enum is clean way to create a singleton. It handles serialization using java's in-built
 * mechanism and still ensure single instance
 */
public enum RegistryEnum {

	INSTANCE;

    public void someMethod() {
        //Do actual work here.
    }
}
