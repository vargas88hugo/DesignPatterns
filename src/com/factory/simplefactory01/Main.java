package com.factory.simplefactory01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Post post = PostFactory.createPost("news");
		System.out.println(post);
	}

}
