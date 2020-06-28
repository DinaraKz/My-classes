package com.syntax.class02;

public class HomeWork2 {
	public static void main(String[] args) {
		//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
		double num1 = 1.5;
		double num2 = 2.5;
		
		double dsum = num1 + num2;		
		double dsub = num1 - num2;
		double dmult = num1 * num2;
		double ddiv = num1 / num2;
		
		//Your program should say. 
		//"The _______ of 2 numbers ___ and ___ is equal to _____"
		System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to " + dsum);
		System.out.println("The substraction of 2 numbers " + num1 + " and " + num2 + " is equal to " + dsub);
		System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 + " is equal to " + dmult);
		System.out.println("The division of 2 numbers " + num1 + " and " + num2 + " is equal to " + ddiv);
		
		
		System.out.println("-----------------");
		//Write a program to find the square of the number 3.9. 
		//You program should say "The square of the ____ is ____ "
		double num3 = 3.9;
		
		System.out.println("The square of the " + num3 + " is " + num3*num3);
		
		
		System.out.println("-----------------");
		//Write a program to print the area and perimeter of a rectangle with width = 5 and  height = 8. 
		//Your program should say. 
		//"The perimeter of a rectangle with width ___ and height ____ is equal to _____ and the area is __"
		int width = 5;
		int height = 8;
		
		System.out.println("The perimeter of a rectale with width " + width + " and height " + height + 
				" is equal to " + (width+height)*2 + " and area is "  + width*height);
		
	} 

}
