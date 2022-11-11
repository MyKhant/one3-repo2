package com.jdc.mkk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStream implements Serializable {

	private static final long serialVersionUID = 1L;
	private static File file;

	public static void main(String[] args) {
		file = createFile();
		writeFile();
		readFile();
	}

	static void readFile() {
		try (ObjectInputStream fin = new ObjectInputStream(new FileInputStream(file))) {
			Human h = (Human) fin.readObject();
			System.out.println(h.getId() + "\t" + h.getName() + "\t" + h.getAge());
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	static void writeFile() {
		try (ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(file))) {
			Human h = new Human("Maung Maung", 1, 12);
			fout.writeObject(h);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	static File createFile() {

		try {
			file = new File("human.obj");
			if (!file.exists()) {
				file.createNewFile();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return file;
	}

}

class Human implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	private int id;

	public Human(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
