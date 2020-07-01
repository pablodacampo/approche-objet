package fr.diginamic.formes;

public class Rectangle extends Form {

	private double length;	
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double calculatePerimeter() {
		    return length*2+width*2;
	}
   
   public double calculateSurface() {
	      return length*width*2;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
