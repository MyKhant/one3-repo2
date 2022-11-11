package com.jdc.mkk.collection_test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("sad","happy","mad","joyfull");
		Queue<String> q1=new PriorityQueue<>();
		Queue<String> q2=new LinkedList<>();
		q1.add("s1");
		q1.add("s2");
		q1.add("s3");
		q1.add("s4");
		q1.add("s5");
		q1.offer("s6");
		System.out.println(q1.size());
		
		q1.remove();
		q1.poll();
		q1.remove();
		q1.poll();
		q1.remove();
		//q1.poll();
		
		//q1.element();
		q1.peek();
		
		for(String s:q1) {
			System.out.println(s);
		}
	}

}
