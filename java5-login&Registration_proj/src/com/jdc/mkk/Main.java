package com.jdc.mkk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static PersonDb db=new PersonDb();
	public static void main(String[] args) {
		greeting();
		String check="";
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			
			do {
				askPerson(br);
				System.out.println("Do you want try again");
				check=br.readLine();
			}while(check.equals("y"));
			
			System.out.println();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		bye();
	}
	private static void askPerson(BufferedReader br) throws IOException {
		System.out.println("Please type user name !");
		String name=br.readLine();
		System.out.println("Please type user Id /number only!");
		
		int id=convertToInt(br.readLine());
		if(checkDefaultPerson(name, id)) {
			System.out.println(String.format("You have already registor with %s and %d", name,id));
			loginSuccess(br);
		}else {
			System.out.println("You don't have registor and do you want registor");
			String s=br.readLine();
			
			if(s.equals("y")) {
				registorPerson(name,id);
			}else {
				bye();
			}
		}
	}
	private static void registorPerson(String name, int id) {
		db.addPerson(new Person(id,name,Role.USER));
		
	}
	private static void loginSuccess(BufferedReader br) throws IOException {
		System.out.println("""
				 \nPlease select Role!
				 1.Admin
				 2.User
				 
				""" );
		int result = convertToInt(br.readLine());
		checkRole(result);
	}
	private static void checkRole(int  input) {
		switch(input) {
		case 1:
			System.out.println("You have enter with Admin role");
			showPerson();
			break;
		case 2:
			System.out.println("You have enter with user role");
			break;
				default:
					break;
		}
	}
	private static void showPerson() {
		for(Person p:db.showPersons()) {
			System.out.println("Person id:"+p.getId()+"\tPerson name:"+p.getName()+"\tPerson role :"+p.getRole());
		}
	}
	private static int convertToInt(String input) {
		try {
			return Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Please type correct answer !");
		}
		
	}
	private static boolean checkDefaultPerson(String name, int id) {
		
		for(Person p:db.showPersons()) {
			
		
			if(p.getName().equals(name)&&p.getId()==id) {
				return true;
			}
		}
		return false;
	}
	static void greeting() {
		System.out.println("\n================================================");
		System.out.println("");
		System.out.println("************* Hello Person Login ****************");
		System.out.println("");
		System.out.println("================================================\n");
	}
	static void bye() {
		System.out.println("\n================================================");
		System.out.println("");
		System.out.println("************* Bye Bye ****************");
		System.out.println("");
		System.out.println("================================================\n");
	}

}
