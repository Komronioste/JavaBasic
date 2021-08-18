package com.neotech.lesson25;

public class Doctor {
	
	private String licenseId;
	private long phoneNr;
	private String email;
	
	public long getPhoneNr() {
		return phoneNr;
	}
	public void setPhoneNr(long phoneNr) {
		
		//You can add a logic to check if the number has 10 digits
		if (phoneNr==10)
				this.phoneNr = phoneNr;
		else
			System.out.println("You have wrong number of digits");
		
	}
	public String getEmail() {
		return email;
	}
	
	//Setter method for email
	public void setEmail(String email) {
		
		//We have some conditions
		
		if (!email.isEmpty())
		{
			if (email.contains("gmail"))
			{
				this.email = email;
			}
			else
			{
				System.out.println("You have to use gmail");
			}
		}
		
		else
		{
			System.out.println("The email cannot be empty!!!");
		}
		
	}
	
	
	

}
