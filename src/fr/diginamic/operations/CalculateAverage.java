package fr.diginamic.operations;

import java.util.Arrays;

public class CalculateAverage {
	
	private double[] averageArray = new double[0];

	public CalculateAverage() {
	}

	public double[] getAverageArray() {
		return averageArray;
	}
		
	public void	setAverageArray(double[] averageArray) {
		this.averageArray = averageArray;
	}
	
	public void addNumber(double newNumber) {
		double[] newArray = Arrays.copyOf(this.averageArray, this.averageArray.length+1);
		newArray[newArray.length-1] = newNumber;
				this.averageArray = newArray; 	
	}
	
	public double calculate() {
		double total = 0;
		for (int i = 0; i < this.averageArray.length; i++) {
			total += this.averageArray[i];
	}
		double average = total / this.averageArray.length;
		return average;
	}
	
}
