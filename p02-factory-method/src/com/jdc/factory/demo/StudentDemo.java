package com.jdc.factory.demo;

public class StudentDemo {

	public static void main(String[] args) {

		var student1 = StudentFactory.generateByNameAndPhone("Aung Aung", "09782727");
		System.out.println(student1);

		var student2 = StudentFactory.generateByNameAndEmail("Thidar", "thidar@gamil.com");
		System.out.println(student2);

		var gradeOneFactory = new GradeSpecificStudentFactory("Grade One");
		var student3 = gradeOneFactory.withName("Nilar");
		System.out.println(student3);
	}

}
