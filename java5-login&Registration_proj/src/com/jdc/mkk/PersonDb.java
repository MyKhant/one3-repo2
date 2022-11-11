package com.jdc.mkk;

import java.util.Arrays;

public class PersonDb {
	private static final Person dPerson=new Person(1,"Admin",Role.ADMIN);
	private Person[] persons=new Person[1];
	
	
	
	public PersonDb() {
		persons[0]=dPerson;
	}
	public Person getDefaultPerson() {
		return dPerson;
	}
	public void addPerson(Person p) {
		persons = Arrays.copyOf(persons, persons.length+1);
		persons[persons.length-1]=p;
	}
	public Person[] showPersons() {
		return persons;
	}
	
}
