package com.neotech.lesson21;

public class Programming {

	
	Programming(){
		System.out.println("I love Programming");
	}
	
	Programming(String subject){
		System.out.println("I love " + subject);
	}
	
	
	
	public static void main(String[] args) {
		
		Programming p1 = new Programming(); // I love Programming
		
		Programming p2 = new Programming("Neotech"); // I love Neotech
		
		
	}

}
