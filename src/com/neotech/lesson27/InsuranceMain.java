package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceMain {

	public static void main(String[] args) {


		ArrayList<Insurance> insuranceList = new ArrayList<>();
		
		Insurance veh = new Vehicle("Geico", "Mazda");
		Insurance pet = new Pet("PetMed", "Labrador");
		Insurance hel = new Health("MedicAid");
		
		insuranceList.add(hel);
		insuranceList.add(veh);
		insuranceList.add(pet);
		
		insuranceList.add(new Vehicle("PROGRESSIVE", "ROVER"));
		insuranceList.add(new Health("Cigna"));
		
		System.out.println();
		System.out.println("Using For Loop..................");
				System.out.println();
		
		for ( int i = 0 ; i < insuranceList.size(); i++)
		{
			insuranceList.get(i).getQuote();
			insuranceList.get(i).cancelInsurance();
		}
				System.out.println();
		System.out.println("Using For Each..................");
				System.out.println();
				
		for (Insurance a : insuranceList)
		{
			a.getQuote();
			a.cancelInsurance();
		}
		
		System.out.println();
		System.out.println("Using Iterator..................");
				System.out.println();
		
			Iterator<Insurance> it = insuranceList.iterator();
			
			while(it.hasNext())
			{
				Insurance ins = it.next();
				ins.getQuote();
				ins.cancelInsurance();
				
				
				
			}
		
	}

}
