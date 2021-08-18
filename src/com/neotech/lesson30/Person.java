package com.neotech.lesson30;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Person {
	
	
	public String name, lastName;
	private int age, salary;
	
	Person (String name, String lastName, int age, int salary) {
		
		this.name = name;
		this.lastName = lastName;
		this.age = age;
		this.salary = salary;
	}
	
	void printDetails()
	{
		System.out.println(name + " " + lastName + " " + age + " " + salary);
	}

	public static void main(String[] args) {
		
		
		Map <Integer, Person> people = new TreeMap<>();
		people.put(1, new Person("Komron", "B", 30, 100000));
		people.put(2, new Person("Hakan", "K", 22, 100000));
		people.put(3, new Person("Shodmon", "B"	, 20, 80000));
		
		
		for (Entry <Integer, Person> entry : people.entrySet()) // .entrySet() ********** 
		{
			System.out.println(entry.getKey() + " " + entry.getValue().name + " " + entry.getValue().lastName);
		
		entry.getValue().printDetails();
	}
		

	}

}
