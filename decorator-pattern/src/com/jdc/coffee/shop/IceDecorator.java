package com.jdc.coffee.shop;

public class IceDecorator extends CoffeeMackerDecorator {
	public IceDecorator(Maker maker) {
		super(maker);
		this.maker = maker;
	}

	@Override
	public Coffee drip() {
		var coffee = maker.drip();
		coffee.setIce(1);
		return coffee;
	}

}
