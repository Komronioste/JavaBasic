package Practice;

public class AddDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	
	
	
	
	
	
	
	
		System.out.print("Input an integer between 0 and 1000: ");
        int num = 12;

        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);
	
	int tr = 12%10;
	System.out.println(tr);
	
	
	}

}
