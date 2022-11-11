package com.jdc.mkk.school;

public enum Language {
	JAVA("Java Language"),
	PYTHION("Python language"),
	JS("Java Script language"),
	RUBY("Ruby Language");
	
	private String name;
	
	private Language(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
