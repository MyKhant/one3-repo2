package com.jdc.mkk;

import java.io.File;
import java.io.IOException;


public class ExceptionThrowDemo {
	public static void main(String[] args){
		//check(6);
		try {
			Hi h=new Hi();
			h.doSomrthing();
		}catch(MyCustomException e) {
			System.out.println(e.getMessage());
		}
		
	}
	static void check(int a){
		if(a>5) {
			throw new RuntimeException("a is greater than 5");
		}else {
			System.out.println("a is lessthan 5");
		}
		 catchBlock();
	}
	static void catchBlock(){
		
		try {
			File f=new File("test.txt");
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
class Hi{
	String name;
	void doSomrthing(){
		if(name==null) {
			
			throw new MyCustomException("name is null !");
		}
	}
}