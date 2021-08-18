package com.neotech.lesson13;

public class homework01 {

	public static void main(String[] args) {
		
		
		String[][] countries = 	{
								{"USA", "Canada", "Mexico"},
								{"Brazil", "Peru", "Argentina"},
								{"Albania", "Turkey", "Russia", "France", "Italy"},
								{"Uzbekistan", "Tajikistan"},
								{"Sudan", "Egypt", "Morocco", "Zimbabwe", "Nigeria", "Senegal"}
								};
		int sumOfCountries = 0;
		
		for (int i = 0; i < countries.length; i++)
		{
			for (int j = 0; j < countries[i].length; j++)
				
			{		sumOfCountries++;
			System.out.print(countries[i][j] + " ");
			
			}
			System.out.println();
		}
System.out.println();
System.out.println("Total number of countries: " + sumOfCountries);

System.out.println();
System.out.println("-------------------");
System.out.println();
	

	int totalOfCountries=0;
	
			for ( String[] i : countries)
		{
			for (String j : i)
			{
				totalOfCountries++;
				System.out.print(j + " ");
			}
			System.out.println();
		}
			System.out.println("Total num of countries: " + totalOfCountries);
	}

}
