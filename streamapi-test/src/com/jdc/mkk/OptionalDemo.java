package com.jdc.mkk;

import java.util.List;
import java.util.stream.Collectors;

public class OptionalDemo {

	public static void main(String[] args) {
		List<String> lString = List.of("2", "4", "7", "8", "3");
//		List<Integer> l1 = lString.stream().map(Integer::valueOf).collect(Collectors.toList());
//		l1.forEach(a -> System.out.println(a + 3));

		String txt = lString.stream().map(String::valueOf).collect(Collectors.joining(", ", "[", "]"));

		System.out.println(txt);
	}

}
