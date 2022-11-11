package com.jdc.mkk;

public class GenericMethodDemo {

	public static void main(String[] args) {
		GenericMethodDemo gm=new GenericMethodDemo();
		String str=convertToString("tteww");
		gm.showResult(str);
		gm.showResult(str.length());
	}
	static<T> String convertToString(T t) {
		return String.valueOf(t);
	}
	<T> T getResult(T t) {
		return t;
	}
	<T> void showResult(T t) {
		System.out.println("Your result is : "+getResult(t));
	}
}
