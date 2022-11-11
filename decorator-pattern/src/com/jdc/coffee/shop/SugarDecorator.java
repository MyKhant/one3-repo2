package com.jdc.coffee.shop;

public class SugarDecorator extends CoffeeMackerDecorator {

	public SugarDecorator(Maker maker) {
		super(maker);
	}

	@Override
	public Coffee drip() {
		var coffee = maker.drip();
		coffee.setSugar(1);
		return coffee;
	}

}
