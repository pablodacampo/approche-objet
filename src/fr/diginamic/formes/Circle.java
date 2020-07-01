package fr.diginamic.formes;

public class Circle extends Form {

		private double radius;

		public Circle(double radius) {
			this.radius = radius;    
		
		}
		
	   public double calculatePerimeter() {
		    return radius*Math.PI*2;
	   }
		
	   public double calculateSurface() {
	      return radius*radius*Math.PI;
	   }
			
		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}
		
	}