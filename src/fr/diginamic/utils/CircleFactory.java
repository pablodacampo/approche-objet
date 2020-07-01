package fr.diginamic.utils;

import entities.Circle;

public class CircleFactory {

	public static Circle makeCircle(double double1) {
		
		return new Circle(double1);
	}

}
