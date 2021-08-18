package com.neotech.lesson11;

public class IntroToArray {

	public static void main(String[] args) {
		
		
		//data type                identifier           assignment operator           value
		int							 num						=						10;
		
		//2nd way
		int num1;  //declare
		num1=10;   //initialize
		
		
		int [] array;			//declare array
		array = new int[5];		//initialize
		
		int[] array2 = new int[5]; //declaration + initialization
		
		
		array[0] = 10;
		
		// [ 10 ] [ ] [ ] [ ] [ ] 
		
		array[2] = 30;
		
		// [ 10 ] [ ] [ 30 ] [ ] [ ] 
		
		array[1] = 20;
		
		// [ 10 ] [ 20 ] [ 30 ] [ ] [ ] 
		
		array [3] = 40;
		
		// [ 10 ] [ 20 ] [ 30 ] [ 40 ] [ ] 
		
		array [4] = 50;
		
		// [ 10 ] [ 20 ] [ 30 ] [ 40 ] [ 50 ]
		
			
		System.out.println(array[4]);			//access array element
		
		// if our array is [27]. it means our last index is [26] because 0 is also an index

		
		String[] strArray = new String[4];
		
		strArray[0] = "New York";
		// [ New York    ,        ,        ,     ]
		
		strArray[1] = "New Jersey";
		// [ New York    ,  New Jersey      ,        ,     ]
		
		strArray[2] = "Connecticut";
		// [ New York    ,  New Jersey      ,   Connecticut     ,     ]
		
		strArray[3] = "Pennsylvania";
		// [ New York    ,  New Jersey      ,   Connecticut     ,  Pennsylvania   ]
		
		System.out.println("I live in " + strArray[1]);   // will print I live in New Jersey
		
		// strArray[4] = "California"; will give error saying out of bounds as there is no index #4 in our array. ours has 0,1,2,3. => 4 indexes
		
		char[] letters = new char[6];
		
		letters[0] = 'B';
		letters[5] = 'A';
		letters [4] = 'C';
		letters [1] = 'X';
		letters[3] = 'Y';
		//can leave index 2 as empty or any other. 
		
		System.out.println("Letter at index 4 is: "+ letters[4]);  //will print Letter at index 4 is: C
		
		letters[4] = 'D';
		
		System.out.println("Letter at index 4 is: "+ letters[4]); // now will print new value: Letter at index 4 is: D

		
		
	}

}
