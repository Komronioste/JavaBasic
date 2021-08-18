package Practice;

public class Conditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int hour = 11;
		if (hour<12) { 
			System.out.println("Good morning!");
		}

		System.out.println();
		
		int time = 15;
		if (time>= 12 && time<15) {   //  && stands for both conditions should be met.    || means OR where only one condition should be met
			System.out.println("Good Afternoon");
		}
		else  { 
			System.out.println("Good Evening");
		}
		
		System.out.println();
		
		//Temperature check

		double temp;
		temp = 40;
		
		if (temp<32) {
			
			System.out.println("Water will freeze with temperature " + temp);
		}
		else {
			
			System.out.println("Water will not freeze with temperature " + temp);
		}
	}


}
