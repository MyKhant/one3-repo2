package com.jdc.mkk;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionDemo {
	static Hello hello=new Hello();
	public static void main(String[] args) {
		unCheckedException();
		checkedException();
	}
	static void checkedException() {
		try(FileWriter fw=new FileWriter("hello.txt")){
			fw.write("hello");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage()); 
		}
	}
	//static void errorException() {}
	static void unCheckedException() {
		try {
			hello.greet();
		}catch(NullPointerException e) {
			System.out.println("Object not created");
		}finally {
			System.out.println("Finally");
		}
		System.out.println("Outer");
	}

}
class Hello{
	void greet() {
		System.out.println("Hello java developer");
	}
}
