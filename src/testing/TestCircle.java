package testing;

import entities.Circle;
import fr.diginamic.utils.CircleFactory;

public class TestCircle {

	public static void main(String[] args) {
		
		Circle circle1 = CircleFactory.makeCircle(3.57);
		
	      System.out.println("Circle 1 has perimeter of " 
	    	         + circle1.getPerimeter() + " and area of " + circle1.getArea());		
		
		Circle circle2 = CircleFactory.makeCircle(10.57);
			
	      System.out.println("Circle 2 has perimeter of " 
	    	         + circle2.getPerimeter() + " and area of " + circle2.getArea());	
		
	}

}
