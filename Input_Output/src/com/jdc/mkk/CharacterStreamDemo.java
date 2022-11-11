package com.jdc.mkk;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
	private static File file;
	public static void main(String[] args) {
		file=createFile();
		writeFile();
		readFile();
	}
	static void readFile() {
		try(FileReader fin=new FileReader(file)){
			int i=0;
			while(0<(i=fin.read())) {
				System.out.println(i);
			}
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	static void writeFile() {
		try(FileWriter fin=new FileWriter(file)){
			fin.write("Hello file Writer");
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	static File createFile() {
		
		try {
			file=new File("fileReader.txt");
			if(!file.exists()) {
				file.createNewFile();
				
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return file;
	}

}
