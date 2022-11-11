package com.jdc.mkk;

import java.util.Arrays;
import java.util.List;

public class IntermediateDemo {

	public static void main(String[] args) {
		List<String> arrString = Arrays.asList("3", "4", "5", "6", "7", "8", "9", "11");
		List<Integer> arrInt = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//		List<Integer> list = arrString.stream().map(a -> Integer.parseInt(a) * 2).filter(i -> i % 3 == 0).toList();
//		list.forEach(System.out::println);
//		Stream.of(arrInt, list).flatMap(a -> a.stream())
//		.filter(f->f>10)
//		.forEach(System.out::println);

//		boolean b = arrString.stream().map(s -> Integer.parseInt(s)).filter(f -> f % 2 != 0)
//				// .limit(2).filter(f1 -> f1 > 3)
//				// .forEach(System.out::println);
//				// .allMatch(a->a==5);
//				.noneMatch(m -> m < 2);
//		System.out.println(b);
//		int i = IntStream.rangeClosed(1, 10).reduce(0, (a, c) -> a + c);
//		System.out.println(i);

		arrInt.stream().dropWhile(p -> p < 5).forEach(System.out::println);

		Object b = arrString.stream().findFirst().ofNullable("ss").isEmpty();
		System.out.println(b);
	}

}
