package com.neotech.lesson27;

import java.util.ArrayList;

public class ArrayListNonGeneric {

	public static void main(String[] args) {


		//generic arrayList
		
		ArrayList <Double> al = new ArrayList<>();
		
		al.add(10.99);
		al.add(21.2);
		al.add(15.5);
		
	//	al.add(50);	 Java shows error, because you said everything in this collection will be Double
	//	al.add("Hello");   not Double...
		
		System.out.println(al);
		
		al.set(1, 12.5);   //changes value in index 1 to 12.5
		
		System.out.println(al);
		
		al.remove(2);
		
		System.out.println("Element at index 0 is: " + al.get(0));
		System.out.println();
		
		for ( int i = 0; i < al.size(); i++)
		{
			System.out.print(al.get(i) + " - ");
		}
		System.out.println();
		
		//   NON GENERIL ArrayList
		
		
		
		
		
		ArrayList al2 = new ArrayList();
		
		al2.add(100);
		al2.add("Hello");
		al2.add(22.5);
		
		al2.add(al);
		System.out.println(al2);
		
		for (Object obj : al2)
		{
			System.out.print(obj + " - ");
		}
		
		System.out.println();

		int[] a = {2,2,4,5};
		al2.add(a);
		
		for (Object obj : al2)
		{
			System.out.print(obj + " - ");
		}
		
		System.out.println();
	}

}
