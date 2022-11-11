package com.jdc.builder.demo;

public class BuilderDemo {

	public static void main(String[] args) {

		var builder = Student.builder();
		var student = builder.id(3).name("Aung Aung").phone("093737673").email("aung@gmail.com").grade("Grade 10")
				.build();
		System.out.println(student);
	}

}
