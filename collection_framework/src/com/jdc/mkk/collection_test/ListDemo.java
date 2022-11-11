package com.jdc.mkk.collection_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List<String> arr=Arrays.asList("ss","Aa","Bb","as","as","gg");
		List<String> arrList=new ArrayList<>(arr);
		List<String> linkList=new LinkedList<>(arr);
		showData1(arrList);
		System.out.println();
		
		
	}
	static void showData1(List<String> str) {
		for(int i=0; i<str.size(); i++) {
			if(str.get(i).equals("Bb")) {
				str.remove(i);
			}
			System.out.print(str.get(i)+"\t");
		}
		System.out.println("\n"+str.indexOf("gg"));
	}
	static void showData2(List<String> str) {
		for(String s:str) {
			System.out.println(s);
		}
	}
	static void showData3(List<String> str) {
		Iterator<String> itr=str.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
 	}
}
