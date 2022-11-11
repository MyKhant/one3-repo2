package com.jdc.coffee.shop;

public class AppMain {
	public static void main(String[] args) {
		var pureCoffeeMaker = new CoffeeMaker();
		System.out.println(pureCoffeeMaker.drip());

		var blackCoffeeMaker = new SugarDecorator(pureCoffeeMaker);
		System.out.println(blackCoffeeMaker.drip());

		var iceCoffeMaker = new IceDecorator(blackCoffeeMaker);
		System.out.println(iceCoffeMaker.drip());

		var noSugarIceCoffeeMaker = new IceDecorator(pureCoffeeMaker);
		System.out.println(noSugarIceCoffeeMaker.drip());
	}
}
