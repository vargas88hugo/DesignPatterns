package com.bridge.bridge01;

public class Main {

	public static void main(String[] args) {
		
		FifoCollection<Integer> collection = new Queue<Integer>(new SingleLinkedList<>());
		collection.offer(10);
		collection.offer(40);
		collection.offer(99);
		
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		System.out.println(collection.poll());
		
		// null poll
		System.out.println(collection.poll());
	}

}
