package testing;

import operations.CalculateAverage;

public class AverageTest {
	
	public static void main(String args[]) {
		
		CalculateAverage numbers1 = new CalculateAverage();
		
		numbers1.addNumber(25);
		numbers1.addNumber(15);
		numbers1.addNumber(5);
		numbers1.addNumber(35);
		System.out.println("The average of numbers1 is : " + numbers1.calculate());
		
		
		CalculateAverage numbers2 = new CalculateAverage();
		
		numbers2.addNumber(17);
		numbers2.addNumber(6);
		numbers2.addNumber(3);
		numbers2.addNumber(14);
		System.out.println("The average of numbers1 is : " + numbers2.calculate());

	}
}


