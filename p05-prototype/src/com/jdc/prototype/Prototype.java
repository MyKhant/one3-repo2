package com.jdc.prototype;

public abstract class Prototype implements Shape {

	protected String name;

	public Prototype(String name) {
		super();
		this.name = name;
	}

	public Prototype(Prototype other) {
		this.name = other.name;
	}
}
