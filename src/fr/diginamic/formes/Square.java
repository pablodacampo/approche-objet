package fr.diginamic.formes;

public class Square extends Form {

	private double length;
	public Square(double length) {
		super();
		this.length = length;
	}
	
	public double calculatePerimeter() {
		    return length*4;
	}
   
   public double calculateSurface() {
	      return length*length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}


}
