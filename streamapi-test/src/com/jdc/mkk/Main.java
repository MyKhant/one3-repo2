package com.jdc.mkk;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) throws IOException {
//		int[] arrInt = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		Arrays.stream(arrInt).forEach(a -> System.out.println(a));
//		List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 8, 9, 0);
//		sum(list);
		Files.lines(Path.of("hello.txt")).forEach(System.out::println);
//		int a = IntStream.range(1, 10).sum();
//		System.out.println(a);
//
//		int b = IntStream.rangeClosed(1, 10).sum();
//		System.out.println(b);

		DoubleStream.of(Math.random()).limit(3).forEach(System.out::println);
		DoubleStream.generate(() -> Math.random()).limit(5).forEach(System.out::println);
		System.out.println(IntStream.iterate(1, a -> a + 1).limit(10).sum());
	}

	static void sum(List<Integer> list) {
		int i = list.stream().mapToInt(a -> a).sum();
		System.out.println(i);
	}
}
