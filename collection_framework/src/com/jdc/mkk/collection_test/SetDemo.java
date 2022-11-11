package com.jdc.mkk.collection_test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//Set<String> hashSet=new HashSet<>();
		//Set<String> hashSet=new TreeSet<>();
		Set<String> hashSet=new LinkedHashSet<>();
		
		hashSet.add("May Moe");
		hashSet.add("Min Aung");
		hashSet.add("Aung ko oo");
		hashSet.add("Wanna");
		hashSet.add("May Moe");
				
		for(String str:hashSet) {
			System.out.println(str);
		}
		
	}
	static void start(Set<Integer> strs) {
		for(int i=0; i<10; i++) {
			strs.add(i);
		}
	}

}
