package testing;

import entities.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10.1, 5.2);
		
	      System.out.println("Rectangle 1 has perimeter of " 
	    	         + r1.getPerimeter() + " and area of " + r1.getArea());		
		
		Rectangle r2 = new Rectangle(20.5, 15.4);
			
	      System.out.println("Rectangle 2 has perimeter of " 
	    	         + r2.getPerimeter() + " and area of " + r2.getArea());	
		

	}

}
