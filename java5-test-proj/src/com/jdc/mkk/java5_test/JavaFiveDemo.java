package com.jdc.mkk.java5_test;

import static com.jdc.mkk.java5_test.anotherpkg.AnotherClass.name;
import static com.jdc.mkk.java5_test.anotherpkg.AnotherClass.show;
public class JavaFiveDemo {
	public static void main(String... args) {
		Integer wint=20;
		int pint=wint;
		name="sss";
		show();
		
		//String[]strs= {"ff","ee","ww","rr"};
		testVarags(4,"ff","ee","ww","rr");
	}
	static void testVarags(int i,String... names) {
		for(String s:names) {
			System.out.println(s);
		}
	}
}
