package com.jdc.mkk;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File("hello.txt");
		file.deleteOnExit();
		System.out.println(file.exists());
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isAbsolute());
	}

}
