package com.jdc.mkk.school;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

@SuppressWarnings("serial")
public class SchoolDemo implements Serializable{
	@SuppressWarnings("unused")
	private String name;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student name : ");
		String name=br.readLine();
		
		System.out.println("Enter Student Age : ");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("""
				select course!
				1.Java
				2.Java Script
				3.Python
				4.Ruby
				""" );
		String course=br.readLine();
		String [] arr=course.split(" ");
		
		
		Student st=new Student();
		st.setName(name);
		st.setAge(age);
		System.out.print(String.format("%s is at %s years old and select courses is :", name,age));
		for(String s:arr) {
			int i=Integer.parseInt(s);
			st.setCourse(selectCourse(i));
			System.out.println(st.getCourse());
		}
	}
	@Deprecated
	static Language selectCourse(int i) {
		switch(i) {
		case 1:
			return Language.JAVA;
		case 2:
			return Language.JS;
		case 3:
			return Language.PYTHION;
		case 4:
			return Language.RUBY;
		default:
			return null;
		}
	}
}
