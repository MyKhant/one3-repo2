package com.jdc.mkk.collection_test;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {

	public static void main(String[] args) {
		Deque<String>d1=new LinkedList<>();
		d1.offer("d1");
		d1.add("d2");
		d1.add("d3");
		d1.add("d4");
		d1.addFirst("do");
		d1.addLast("d5");
		d1.add("d6");
		//d1.poll();
		d1.offerLast("d7");
		for(String s:d1) {
			System.out.println(s);
		}
		
	}

}
