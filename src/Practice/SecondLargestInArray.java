package Practice;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = { 1, 2000,5000, 7200, 100, 10, 11700, 3000, 4100, -9999 };

		int lar = num[0];
		int slar = num[0];

		System.out.println("--------------------");

		for (int i = 0; i < num.length; i++) {
			if (lar < num[i]) {
				lar = num[i];
			}

		}
		
		for (int i = 0; i < num.length; i++)
			if (slar<num[i] && num[i] < lar )
			{
				slar = num[i];
			}
		System.out.println("slar = " + slar);
		System.out.println("lar = " + lar);
		
		
	

	}

}
