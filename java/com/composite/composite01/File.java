package com.composite.composite01;

// The component base class
public abstract class File {
	
	private String name;
	
	public File(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void ls();
	
	public abstract void addFile(File file);
	
	public abstract File[] getFiles();
	
	public abstract boolean removeFile(File file);
}
