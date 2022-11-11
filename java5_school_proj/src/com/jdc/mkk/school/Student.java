package com.jdc.mkk.school;

import java.lang.reflect.Method;

public class Student {
	private String name;
	private int age;
	private Language course;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCourse(Language course) {
		this.course=course;
	}
	@StudentAnno
	public String getCourse() {
		try {
			Method m=Student.class.getDeclaredMethod("getCourse");
			StudentAnno anno=m.getAnnotation(StudentAnno.class);
			if(course!=null) {
				return course.getName();
			}
			if(anno!=null) {
				return anno.course().getName();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
