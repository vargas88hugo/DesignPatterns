package com.bridge.bridge01;

/**
 * This is the abstraction of the client interaction
 * @param <T>
 */
public interface FifoCollection<T> {

	void offer(T element);
	
	T poll();
}
