package com.neotech.lesson15;

import java.util.Scanner;

public class Email {
	Scanner scan = new Scanner(System.in);
	String firstName, lastName, emailType; 
	
	void createEmail() {
		System.out.println(firstName+lastName+"@"+ emailType + ".com" );
	}

	public static void main(String[] args) {
		
		
		Email firstEmail = new Email();
		firstEmail.firstName = "komron";
		firstEmail.lastName = "babakhanzoda";
		firstEmail.emailType = "gmail";
		
		firstEmail.createEmail();
		
		
	Scanner scan = new Scanner (System.in);
	

	
	
		
	}
}
