package interfaces;

public class Circle implements ObjectGeometric {
	

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double perimeter() {
		return radius*Math.PI*2;
	}
	
	@Override
	public double surface() {
	      return radius*radius*Math.PI;
	}
	
	public double getRadius() {
		return radius;
	}	

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String getType() {
		return "Circle";
}

}
