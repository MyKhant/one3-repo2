package com.jdc.mkk;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ApiInterfaceDemo {

	public static void main(String[] args) {
		Consumer<Integer> c1 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}

		};
		c1.accept(3);
		Consumer<Integer> c2 = a -> System.out.println(a);
		c2.accept(45);
		Consumer<Integer> c3 = ApiInterfaceDemo::show;
		c3.accept(60);

		Function<String, Integer> f = a -> Integer.parseInt(a);
		System.out.println(f.apply("56"));
		Function<String, Integer> f2 = ApiInterfaceDemo::convertToInt;
		System.out.println(f2.apply("23"));

		BiFunction<Integer, Integer, Double> bi = (a, b) -> Double.valueOf((a * b));
		System.out.println(bi.apply(34, 4));
		BiFunction<Integer, Integer, Double> bi2 = ApiInterfaceDemo::example;
		System.out.println(bi2.apply(3, 2));

		Predicate<Integer> p = x -> x > 10;
		System.out.println(p.test(11));

	}

	static double example(int i, int j) {
		return i + j;
	}

	static int convertToInt(String s) {
		return s == null ? 0 : Integer.parseInt(s) + 4;
	}

	static void show(int i) {
		System.out.println("Method ref:" + 1);
	}
}
