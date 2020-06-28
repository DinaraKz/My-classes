package com.syntax.class03;

public class DoubleComparison {
	public static void main(String[] args) {
		//Create a Java program and name it Double Comparison. 
		//Declare 2 double values and if value of first variable 
		//is higher then the second, print "Double value __ is larger than __ ." 
		//Otherwise print...
		double num1 = 15.5;
		double num2 = 15.3;
		if (num1 > num2) {
			System.out.println("Double value " + num1 + " is larger than " +
		num2 + ".");
		}
		//Create a Java program and name it Temperature Check. 
		//Create variable to store temperature. 
		//Your program should check if temperature is below 32 
		//then it should print "Water will freeze with temperature __", 
		//otherwise "Water will NOT freeze with temperature __".

		double temp1 = 32;
		double temp2 = 40;
		
		if (temp2 < temp1) {
			System.out.println("Water will freeze with temperature " + temp2);
		}else {
			System.out.println("Water will NOT freeze with temperature " + temp2);
		}




	}

}
