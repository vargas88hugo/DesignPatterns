package com.bridge.bridge01;

/**
 * This is the implementor that defines the operations
 */
public interface LinkedList<T> {

	void addFirst(T element);
	
	T removeFirst();
	
	void addLast(T element);
	
	T removeLast();
	
	int getSize();
}
