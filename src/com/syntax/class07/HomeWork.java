package com.syntax.class07;

import java.util.Scanner;

public class HomeWork {
	//HomeWork: Using scanner class create calculator. 
	//Allow user to enter 2 numbers and operator(+,-,*,/). 
	//Based on operator provide the result to user.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double result = 0;
		
		System.out.println("Please enter the first number");
		double num1 = scanner.nextDouble();
		
		System.out.println("Please enter the second number");
		double num2 = scanner.nextDouble();
		
		System.out.println("Please enter the operator (+,-,*,/):");
		char operator = scanner.next().charAt(0);
		
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			result = 0;
			System.out.println("Invalid operator!");
		}
		
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
		System.out.println("The result is: " + result);
		}
		
	}

}
