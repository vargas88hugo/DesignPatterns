package com.abstractfactory.abstractfactory01.google;

import com.abstractfactory.abstractfactory01.Instance;
import com.abstractfactory.abstractfactory01.Storage;

public class GoogleComputerEngineInstance implements Instance {

	public GoogleComputerEngineInstance(Capacity capacity) {
		System.out.println("Created Google Computer Engine Instance.");
	}
	
	@Override
	public void start() {
		System.out.println("Compute engine instance started.");
	}

	@Override
	public void attachStorage(Storage storage) {
		System.out.println("Attached " + storage + "to Compute engine instance.");
	}

	@Override
	public void stop() {
		System.out.println("Compute Engine instance stopped.");
	}

	@Override
	public String toString() {
		return "Google Computer Engine Instance";
	}

}
