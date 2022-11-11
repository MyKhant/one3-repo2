package com.jdc.mkk;

import java.io.File;
import java.io.IOException;

public class ExceptionDemoTwo {

	public static void main(String[] args) {
		System.out.println(divided(5));
		
	}
	private static int divided(int i) {
		try {
			File f=new File("ddd.txt");
			f.createNewFile();
			return i/0;
		}catch(ArithmeticException e ) {
			return 0;
		}catch(IOException e) {
			return 1;
		}
	}

}
