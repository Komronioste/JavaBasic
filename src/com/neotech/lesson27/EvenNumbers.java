package com.neotech.lesson27;

import java.util.ArrayList;
import java.util.Iterator;

public class EvenNumbers {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> in = new ArrayList<>();
		
		
		for (int i = 1; i <= 50; i++)
		{
			if (i%2==0)
			in.add(i);
			
		}

		System.out.println(in);
		

		for (Integer d : in)
			System.out.print(d + " ~ ");
		System.out.println();
		
		Iterator<Integer> it = in.iterator();
		
		while(it.hasNext())
		{
			Integer c = it.next();
		if	( c%5==0) {
			it.remove();}
			
		
		}
		System.out.println();
		System.out.println(in);
	}

}
