package com.neotech.lesson21;

public class userClass {
	
	 String name;
	 int phoneNumber;
	
	public void userDetails()
	{
		System.out.println(name + " " + phoneNumber);
	}
	
	userClass(String name, int phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		
		
	}
	
	
}
