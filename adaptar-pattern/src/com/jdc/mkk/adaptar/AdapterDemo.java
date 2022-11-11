package com.jdc.mkk.adaptar;

import com.jdc.mkk.component.TableView;
import com.jdc.mkk.model.StudentModel;

public class AdapterDemo {

	public static void main(String[] args) {
		var model = new StudentModel("student.txt");
		var studentList = model.getAll();
		var adapter = new StudentTableViewAdapter(studentList);
		var tableView = new TableView(adapter);
		tableView.draw();
	}

}
