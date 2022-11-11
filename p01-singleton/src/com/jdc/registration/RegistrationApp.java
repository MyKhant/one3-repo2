package com.jdc.registration;

import java.util.List;

public class RegistrationApp {
	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("Registration Application");
		System.out.println("==========================");

		var controller = new RegistrationController(
				List.of(new CreateStudentAction(), new ShowStudentAction(), new DeleteStudentAction()));
		controller.launch();

		System.out.println("==========================");
		System.out.println("See You!");
		System.out.println("==========================");

	}
}
