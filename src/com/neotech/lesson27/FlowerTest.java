package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {


		Flower[] flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new SunFlower("SunFlower")};
		
		// cannot add more, size is FIXED at the time of declaration.
		
		
		ArrayList<Flower> flowerArrayList = new ArrayList<>();
		flowerArrayList.add(new Rose("Rose"));
		flowerArrayList.add(new Tulip("Tulip"));
		flowerArrayList.add(new SunFlower("SunFlower"));
		
		
		for (int i = 0; i < flowerArrayList.size(); i++) //benefit is of this we can also go from last to first. 
		{
			//1st WAY
			flowerArrayList.get(i).bloom();
			//2nd WAY
			Flower f = flowerArrayList.get(i);
			f.bloom();
		}
		
		System.out.println();
		
		// Using for-each loop
		
		for (Flower f : flowerArrayList)
		
			f.bloom();
		
		System.out.println();
		
		//using Iterator
		
		Iterator<Flower> it = flowerArrayList.iterator();
	
		while(it.hasNext())
		{
			it.next().bloom();
			//or
			
			Flower f = it.next();
			f.bloom();
		}
		
		
	}

}
