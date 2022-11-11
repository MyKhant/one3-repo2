package com.jdc.mkk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
	
	private static File file;
	public static void main(String[] args) {
		
		file=createFile();
		writeFile();
		readFile();
	}
	static void readFile() {
		try(FileInputStream fin=new FileInputStream(file)){
			int i=0;
			while(0<(i=fin.read())) {
				System.out.println(i);
			}
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	static void writeFile() {
		try(FileOutputStream fin=new FileOutputStream(file)){
			byte [] datas="Hello".getBytes();
			fin.write(datas);
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	static File createFile() {
		
		try {
			file=new File("Hello.txt");
			if(!file.exists()) {
				file.createNewFile();
				
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return file;
	}

}
