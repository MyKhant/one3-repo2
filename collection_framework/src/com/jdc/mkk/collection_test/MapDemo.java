package com.jdc.mkk.collection_test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	@SuppressWarnings({ "rawtypes", "unused" })
	public static void main(String[] args) {
		Map<Integer, String> hashMap=new HashMap<>();
		Map<Data, String> treeMap=new TreeMap<>();
		Map<Integer, String> linkMap=new LinkedHashMap<>();
		
		treeMap.put(new Data(3), "three");
		treeMap.put(new Data(5), "five");
		treeMap.put(new Data(1), "one");
		treeMap.put(new Data(2), "two");
		for(Map.Entry e:treeMap.entrySet()) {
			System.out.println(e.getKey()+"\t"+e.getValue());
		}
		System.out.println(treeMap.containsValue("three"));
	}

}
class Data implements Comparable<Data>{
	private int key;
	

	public Data(int key) {
		super();
		this.key = key;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	@Override
	public int compareTo(Data d) {
		return d.getKey()<getKey()?1:-1;
	}

	@Override
	public String toString() {
		return String.valueOf(key);
	}
	
}