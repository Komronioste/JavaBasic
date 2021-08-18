package com.neotech.lesson21;

public class userInfo extends userClass{

	String address;
	
	
	
	userInfo(String name, int phoneNumber, String address)
	{
		super(name, phoneNumber);
		this.address = address;
		super.name = name;
		super.phoneNumber = phoneNumber;
		

	}
	
	public void userDetails()
	{
		System.out.println(name + " " + phoneNumber + " " + address);
	}

	public static void main(String[] args) {
		
		
	userInfo user1 = new userInfo("Komron", 2323123, "Tysons");
		
	user1.userDetails();
	
	userInfo user2 = new userInfo("John", 4987324, "McLean");
	
	user2.userDetails();
		

	}

}
