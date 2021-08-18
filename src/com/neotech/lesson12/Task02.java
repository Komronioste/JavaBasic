package com.neotech.lesson12;

public class Task02 {

	public static void main(String[] args) {

		String[] countries = { "USA", "CANADA", "PERU" };

		for (int i = 0; i < countries.length; i++) {

			if (countries[i].equals("USA")) {
				System.out.println("DC");
			} else if (countries[i].equals("CANADA")) {
				System.out.println("OTTAVA");
			} else if (countries[i].equals("PERU"))

			{
				System.out.println("Lima");
			}

		}

	
		System.out.println("------------------");
		// 2nd way with for-each loop

		for (String country : countries)
		{

			if (country.equals("USA")) {
				System.out.println("DC");
			} else if (country.equals("CANADA")) {
				System.out.println("OTTAVA");
			} else if (country.equals("PERU"))

			{
				System.out.println("Lima");
			}
		}
		

	}
}
