package com.jdc.mkk;

import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class AsArgumentDemo {

	public static void main(String[] args) {
		Predicate<String> p = arg -> !arg.isEmpty() && arg.length() >= 5;
		BiConsumer<String, Predicate<String>> con = (a, b) -> {
			if (p.test(a)) {
				System.out.println("String is not empty and length is equal 2 ." + a);
			} else {
				System.out.println("String is empty or not equal to 2");
			}
		};
		con.accept("Hello", p);
	}

}
