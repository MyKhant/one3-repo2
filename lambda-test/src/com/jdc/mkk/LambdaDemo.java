package com.jdc.mkk;

public class LambdaDemo {

	public static void main(String[] args) {
		Container c1 = new Container() {

			@Override
			public void doSomething(String str) {
				System.out.println("Before :Do something");
			}
		};
		c1.doSomething("ss");
		Container c2 = (a) -> {
			System.out.println("After :Do something");
		};
		c2.doSomething("ee");
	}

}
