package entities;

public class Circle {
	
	private double radius;

	public Circle(double radius) {
		this.radius = radius;    
	
	}
	
   public double getPerimeter() {
	    return radius*Math.PI*2;
   }
	
   public double getArea() {
      return radius*radius*Math.PI;
   }
		
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
}
