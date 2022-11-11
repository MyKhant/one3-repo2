package com.jdc.mkk;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		MyInterOne one = () -> System.out.println("MyInterOne output.");
		one.show();
		MyInterOne o = MethodReferenceDemo::doSomething;
		o.show();

		MethodReferenceDemo ref = new MethodReferenceDemo();
		MyInterTwo two = ref::saySomething;
		two.show("Hello Instance reference.");

		MyInterTwo t = str -> System.out.println(str);
		t.show("Hello instance lambda");

		MyInterThree thr = str -> str;
		thr.show("hello MyInterThree lambda");

		MethodReferenceDemo rf = new MethodReferenceDemo();
		MyInterThree three = rf::getSomething;
		System.out.println(three.show("Hello getSomething reference"));

		MyInterTwo onee = Hello::new;
		onee.show("Testing from two");

		MyInterOne oneee = Hello::new;
		oneee.show();
	}

	static void doSomething() {
		System.out.println("static : Do something");
	}

	void saySomething(String str) {
		System.out.println("instance : say something");
	}

	String getSomething(String str) {
		return str;
	}

}

class Hello {
	Hello() {
		System.out.println("This is not hav parameter");
	}

	Hello(String s) {
		System.out.println("This is constructor" + s);
	}
}

interface MyInterOne {
	void show();
}

interface MyInterTwo {
	void show(String str);
}

interface MyInterThree {
	String show(String str);
}
