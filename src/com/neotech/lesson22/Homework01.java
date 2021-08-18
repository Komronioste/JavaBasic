package com.neotech.lesson22;

public class Homework01 {

	
	private void info (String name, String lname, int age)
	{
		System.out.println("Name: " + name + ", last name: " + lname + ", age: " + age);
	}
	
	private static void info (double height, int weight)
	{
		System.out.println("height: " + height + ", weight: "+ weight);
	}
	
	private static void info (long phone, String email)
	{
		System.out.println("Phone number: " + phone + ", email: " + email);
	}
	
	
	
	public static void main(String[] args) {
		
		Homework01 hw = new Homework01();
		
hw.info("Komron", "Babakhanzoda", 12);
info(6, 140);
info(4348734, "123 Boulevard");
		
	}

}
