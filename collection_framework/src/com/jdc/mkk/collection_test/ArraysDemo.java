package com.jdc.mkk.collection_test;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] data= {"Hello","Java","Super","Developer","Spring"};
		String[] data2= {"Hello"};
		Container[] c1= {new Container(3),new Container(2),new Container(5)};

		System.out.println("Before");
		showData(data);
		System.out.println("After");
		Arrays.sort(c1);
		showData(data);
		System.out.println(Arrays.binarySearch(data, "Super"));
		//Arrays.fill(datas, "Guy");
		//showData(datas);
		data2=Arrays.copyOf(data, data.length);
		System.out.println(Arrays.equals(data,data2));
		
	}
	static void showData(String [] datas) {
		for(String s:datas) {
			System.out.print(s+"\t");
		}
		System.out.println();
	}

}
class Container implements Comparable<Container> {
	private int data;

	public Container(int data) {
		super();
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	@Override
	public int compareTo(Container o) {
		return 0;
	}
	
}