package com.jdc.mkk.collection_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("G","H","g","H","h","A","H","a");
		
		System.out.println("Before...");
		showData(list);
		System.out.println("After...");
		Collections.sort(list);
		showData(list);
		//Collections.shuffle(list);
		//showData(list);
		System.out.println(Collections.binarySearch(list, "H"));
		System.out.println(Collections.frequency(list, "H"));
		List<String> list1=new ArrayList<>();
		System.out.println(Collections.disjoint(list, list1));
		list1.add("Hello");
		list1.add("Hello");
		list1.add("Hello");
		list1=Collections.unmodifiableList(list1);
		//list1.add("b");
		Collections.swap(list, 0, 1);
		showData(list);
		System.out.println(Collections.max(list));
	}
	static void showData(List<?> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
		System.out.println();
	}

}
