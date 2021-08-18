package Practice;

import java.util.Random;

public class BroRandomNumbers {

	public static void main(String[] args) {
		
		Random random = new Random();    // need to import java utility Random
		
		int x = random.nextInt();
		
		
		System.out.println(x);  // will generate anything that fits within integer (-2bill to 2bill)
		
		int y = random.nextInt(11); //will generate anything between 0-10. if you want to have 1-10, need to add +1 int y = random.nextInt(11)+1;
					//no need to specify range for int.
		
		System.out.println(y);
		
		double z = random.nextDouble();  // no need to specify range
		System.out.println(z);
		
		boolean a = random.nextBoolean(); // no need to specify range
		System.out.println(a);
	}

}
