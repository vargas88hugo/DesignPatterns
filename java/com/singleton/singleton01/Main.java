package com.singleton.singleton01;

/**
 * This practice is an implementation of the Singleton Pattern. Today
 * is considered a bad practice because that produces a mutable global
 * state.
 * @author Hugo Vargas
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LazyRegistryIODH singleton;
		
		singleton = LazyRegistryIODH.getInstance();
		LazyRegistryIODH singleton2 = LazyRegistryIODH.getInstance();
		System.out.println(singleton == singleton2);
	}

}
