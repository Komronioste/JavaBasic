package com.neotech.lesson20;

public class Students {

	
	
	String name; 
	String address;
	int b;
	
	 Students(String name, String address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo()
	{
		System.out.println(name + " lives at the address: " + address);
	}
	
	
	
	
	public static void main(String[] args) {
		
		Students s1 = new Students("Alex", "3200 Brooklyn Blvd, Brooklyn");
		Students s2 = new Students("John", "4612 Arlington Blvd, Fairfax");
	
		
		s1.displayInfo();
		s2.displayInfo();
		

		
	}

}
