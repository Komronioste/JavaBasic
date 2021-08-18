package Practice;

public class BroIfStatements {

	public static void main(String[] args) {
		
		
		
		int age = 75;
		
		if (age >= 18)
		{
			System.out.println("You are an adult");  // if "if" statement true, it will skip all the remaining conditions
		}
		else if (age>=75)							// to compare if something is equal, need to use " == ", " = " is an assignment operator.
		{
			System.out.println("Ok, Boomer!");
		}
		
		else {
			System.out.println("You are not an adult");
		}

	}

}
