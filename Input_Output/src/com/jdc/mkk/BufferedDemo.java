package com.jdc.mkk;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedDemo {

	private static File file;
	public static void main(String[] args) {
		file=createFile();
		writeFile();
		readFile();
	}
	static void readFile() {
		try(BufferedReader fin=new BufferedReader(new FileReader(file))){
			String str="";
			while(null!=(str=fin.readLine())) {
				System.out.println(str);
			}
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	static void writeFile() {
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter fin=new BufferedWriter(new FileWriter(file,true))){
			String str="";
			do {
				System.out.println("Please type what do you want to say : ");
				fin.write(br.readLine());
				System.out.println("Do you want to write again!? y/other");
				str=br.readLine();
			}while("y".equals(str));
			
		}catch(IOException e) {
			System.err.println(e.getMessage());
		}
	}
	static File createFile() {
		
		try {
			file=new File("buffer.txt");
			if(!file.exists()) {
				file.createNewFile();
				
				
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return file;
	}

}
