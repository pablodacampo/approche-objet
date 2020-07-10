package entities;

public class Rectangle {
	
	private double length;	
	private double width;
	
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	public double getPerimeter() {
		    return length*2+width*2;
	}
   
   public double getArea() {
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
