package interfaces;

public class Rectangle implements ObjectGeometric {

	private double length;	
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double perimeter() {
	    return length*2+width*2;
	}

	@Override
	public double surface() {
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

	@Override
	public String getType() {
		return "Rectangle";
	}

}
