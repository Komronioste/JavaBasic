package com.neotech.lesson25;

public class Registration {

	private String email;
	private String userName;
	private String password;

	private void getEmail(String email) {
		if (email.contains("yahoo"))
			this.email = email;
		else
			System.out.println("You should use Yahoo email");
	}

	private void getName(String userName) {
		if (!userName.isEmpty() && userName.length() >= 6)
			this.userName = userName;
		else
			System.out.println("Your password cannot be shorter than 6 characters");
	}

	private void getPassword(String password) {
		if (!password.isEmpty() && password.length() >= 6) {
			if (!password.contains(userName))
				this.password = password;
			else
				System.out.println("Your password cannot contain your username");
		} else
			System.out.println("Your password should be at least 6 characters");

	}

	public static void main(String[] args) {

		Registration r1 = new Registration();

		r1.getEmail("dksjahd@yahoo.com");
		r1.getName("Komron");
		r1.getPassword("Koad");

	}

}
