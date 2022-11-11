package com.jdc.mkk;

public class ChangeLambdaDemo {

	public static void main(String[] args) {
		// Container c1 = str -> System.out.println(str);
		String ss = "sssa";
		ContainerTwo c1 = new ContainerTwo() {

			@Override
			public void doSomething(String str) {
				System.out.println(ss);
			}

		};
		c1.doSomething("Hello");
		// ss = "ssaskhd";
		ContainerThree c2 = s -> s;
		// String str2 = c2.getValue("Hello Java Dev");
		System.out.println(c2.getValue("Hello java dev"));
		class Test {
			void saySomething() {
				System.out.println(ss);
			}
		}
	}

	void show() {

	}

}

interface ContainerTwo {
	void doSomething(String str);
}

interface ContainerThree {
	String getValue(String s);
}
