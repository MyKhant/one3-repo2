package com.jdc.coffee.shop;

public abstract class CoffeeMackerDecorator implements Maker {

	protected Maker maker;

	public CoffeeMackerDecorator(Maker maker) {
		this.maker = maker;
	}

}