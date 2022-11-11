package com.jdc.mkk.java5_test.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CustomAnnoDemo {
	@MyAnno(name="PPP")
	private static String name;
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException {
		showName();
	}
	@MyAnno(name="Kyaw Gyi")
	static void showName() throws NoSuchMethodException, SecurityException, NoSuchFieldException{
		Method m=CustomAnnoDemo.class.getDeclaredMethod("showName");
		MyAnno annoM=m.getAnnotation(MyAnno.class);
		if(annoM != null) {
			System.out.println(annoM.name());
		}
		Field f=CustomAnnoDemo.class.getDeclaredField("name");
		MyAnno annoF=f.getAnnotation(MyAnno.class);
		if(annoF!=null) {
			System.out.println(annoF.name());
		}
		
	}
}
@DayAnno(day=Day.MON)
class WeekEnd{
	//@DayAnno(day=Day.MON)
	void doSomething() {
		
	}
}
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.FIELD})
@interface MyAnno{
	String name()default "No Name";
	
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface DayAnno{
	Day day();
}
enum Day{
	MON,TUE;
}