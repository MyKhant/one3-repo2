package com.jdc.mkk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo {

	private static File file;

	public static void main(String[] args) {
		file = createFile();
		writeFile();
		readFile();
	}

	static void readFile() {
		try (DataInputStream fin = new DataInputStream(new FileInputStream(file))) {
			int age = fin.readInt();
			String name = fin.readUTF();
			double d = fin.readDouble();
			System.out.println(name + "\t" + age + "\t" + d);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	static void writeFile() {
		try (DataOutputStream fin = new DataOutputStream(new FileOutputStream(file))) {
			int age = 34;
			String name = "K K K";
			double d = 333.23;
			fin.writeInt(age);
			fin.writeUTF(name);
			fin.writeDouble(d);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	static File createFile() {

		try {
			file = new File("intData.txt");
			if (!file.exists()) {
				file.createNewFile();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return file;
	}

}
