package com.jdc.registration;

public class DeleteStudentAction implements BusinessAction {

	@Override
	public String title() {

		return "Delete Student";
	}

	@Override
	public void doAction() {
		var id = Inputs.readInt("Enter Student Id");
		var result = StudentRegistry.getInstance().delete(id);
		System.out.println("There are %d students in our application.".formatted(result));
	}

}
