package com.jdc.registration;

import static com.jdc.registration.Inputs.readString;

public class CreateStudentAction implements BusinessAction {

	private StudentRegistry registory;

	public CreateStudentAction() {
		registory = StudentRegistry.getInstance();
	}

	@Override
	public String title() {
		return "Create New Student";
	}

	@Override
	public void doAction() {
		var student = new Student();
		student.setName(readString("Enter Name"));
		student.setPhone(readString("Enter Phone"));
		student.setEmail(readString("Enter Email"));

		var result = registory.addStudent(student);
		System.out.println("There are %d students in our application.".formatted(result));

	}

}
