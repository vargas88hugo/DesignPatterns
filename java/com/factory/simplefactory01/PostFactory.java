package com.factory.simplefactory01;

/**
 * This class acts as a simple factory creation of
 * different posts on web site
 * @author Hugo Vargas
 */
public class PostFactory {
	
	public static Post createPost(String type) {
		switch(type) {
		case "blog":
				return new BlogPost();
		case "news":
				return new NewsPost();
		case "product":
				return new ProductPost();
		default:
				throw new IllegalArgumentException("Post type is unown");	
		}
	}
}
