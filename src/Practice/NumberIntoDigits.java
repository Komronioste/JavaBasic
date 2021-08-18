package Practice;

import java.util.Scanner;

public class NumberIntoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);

System.out.println("Please enter six-digit number");
int n3 = scan.nextInt();

int numb1 = n3/100000%10;
int numb2 = n3/10000&10;
int numb3 = n3/1000%10;
int numb4 = n3/100%10;
int numb5 = n3/10%10;
int numb6 = n3 % 10;

System.out.println(numb1 + " " + numb2 + " " + numb3 + " " + numb4 + " " + numb5 + " " + numb6 );


	}

}
