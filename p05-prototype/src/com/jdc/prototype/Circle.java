package com.jdc.prototype;

public class Circle extends Prototype {

	private double radius;

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	public Circle(Circle other) {
		super(other);
		this.radius = other.radius;
	}

	@Override
	public void draw() {
		System.out.println("%s with radius %f.".formatted(name, radius));
	}

	@Override
	public Shape copy() {
		return new Circle(this);
	}

}
