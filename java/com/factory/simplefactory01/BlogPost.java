package com.factory.simplefactory01;

/**
 * This class represents a post product
 * @author Hugo Vargas
 */
public class BlogPost extends Post {

	private String author;
	
	private String[] tags;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String[] getTags() {
		return tags;
	}
}
