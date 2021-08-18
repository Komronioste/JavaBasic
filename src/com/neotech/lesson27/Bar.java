package com.neotech.lesson27;

import java.util.ArrayList;

public class Bar {

	public static void main(String[] args) {


		ArrayList<String> drinkList = new ArrayList<>();
		drinkList.add("Vodka");
		drinkList.add("Liquid");
		drinkList.add("Tequilla");
		drinkList.add("Orange Juice");
		drinkList.add("Brisk");
		drinkList.add("Beer");
		
		
		
		for (String dr : drinkList)  // will not set new values in the List
		{
			dr = (dr.contains("e") || dr.contains("a")) ? "water" : dr;
			System.out.print(dr + " - ");
			
		
		}
System.out.println();

		for (int i =0 ; i < drinkList.size(); i ++) //Will set new values in the List
		{
			if (drinkList.get(i).contains("e") || drinkList.get(i).contains("a"))
			{
				drinkList.set((i), "water");
			}
		}
		System.out.println(drinkList);
		

	}

}
