package Practice;

public class BroArraysIntro {

	public static void main(String[] args) {
		
		
		
		// array = used to store multiple values in a single variable
		
		String[] cars = {"Camaro","Corvette","Tesla","BMW"};  // now each value inside array is called an element, first element would be "Camaro"
																					// [] straight brackets should follow data type
		cars[0] = "Mustang";			// java starts count from 0, so Camaro would be 0, Corvette -1 , Tesla is 2.
		
		System.out.println(cars[3]);		
		
		/////////////////////////////// 2nd WAY of declaring an array
		
		String[] vehicles = new String[3];
		
		vehicles[0] = "Camaro";
		vehicles[1] = "Corvetter";
		vehicles[2] = "Tesla";
		
		for (int i=0; i<vehicles.length; i++)
		{
			System.out.println(vehicles[i]);
		}
		
		
		String[][] names = {{"Komron", "Zarina", "Amir", "Dilorom"}, {"Umed", "Firuza", "Shodmon", "Farzon"}};

		
		for (int i = 0; i < names.length; i++)
		{
			for ( int j=0; j < names[i].length; j++)
			{
				System.out.print(names[i][j] + " ");   // i is responsible for number of array, j is responsible for index number of that array
			}
			System.out.println();
		}
		
		System.out.println(names[1][2]);
		
		
	}

}
