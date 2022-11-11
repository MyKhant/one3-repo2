package com.jdc.mkk;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDemo implements Serializable {
	private static final long serialVersionUID = 1L;
	private static Scanner sc;
	private static File file;
	static String name;
	static int age;
	static List<Person> list;
	static Object obj;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		list = new ArrayList<>();
		System.out.println("Enter your name:");
		name = sc.nextLine();
		System.out.println("Enter your age:");
		age = sc.nextInt();
		file = createFile();
		list.add(new Person(name, age));

		writeFile();
		readFile();
	}

	@SuppressWarnings({ "unchecked", })
	static void readFile() {
		try (ObjectInputStream fin = new ObjectInputStream(new FileInputStream(file))) {
			obj = fin.readObject();
			List<Person> list = (List<Person>) obj;
			list.forEach(System.out::println);
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

	static void writeFile() {
		try (ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(file))) {
			fout.writeObject(list);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	static File createFile() {

		try {
			file = new File("person.txt");
			if (!file.exists()) {
				file.createNewFile();

			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return file;
	}

}

class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
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

}
