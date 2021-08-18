package Practice;

public class BroSwitch {

	public static void main(String[] args) {
		
		// switch = statement that allows a variable to be tested for equality against a list of values. 
		// switch works only with : byte, short, char, int, Enum Types and String.
		
		String day = "Monday";
		
		switch (day)
		{
		
		case "Sunday":  System.out.println("It's Sunday!");
		break;
		
		case "Monday":  System.out.println("It's Monday!");
		break;																//if there is no break, codes will be executed until it finds the next break.
		
		case "Tuesday":  System.out.println("It's Tuesday!");
		break;
		
		case "Wednesday":  System.out.println("It's Wednesday!");
		break;
			
		case "Thursday":  System.out.println("It's Thursday!");
		break;
		
		case "Friday":  System.out.println("It's Friday!");
		break;
		
		case "Saturday":  System.out.println("It's Saturday!");
		break;
		
		default: System.out.println("It's not a day!");
		}
		

	}

}
