package testing;

import operations.Operations;

public class TestOperations {
	
	public static void main(String[] args) {
		
		double sum1 = Operations.calculate(18.78, 18.92, '+');
		System.out.println(sum1);
		double sum2 = Operations.calculate(18.78, 8.92, '-');
		System.out.println(sum2);
		double sum3 = Operations.calculate(18.78, 18.92, '/');
		System.out.println(sum3);
		double sum4 = Operations.calculate(18.78, 8.92, '*');
		System.out.println(sum4);
		

	}

}
