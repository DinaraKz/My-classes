package com.syntax.class05;

public class LogicalAnd {
	public static void main(String[] args) {
		// declare a number
		//if number is between 1 and 10--> number is small
		//if number is between 11 and 100--> number is medium
		//if number is between 101 and 1000--> number is large
		
		int num = -45;
		if(num >= 1 && num <= 10) {
			System.out.println(num + " is a small number");
		} else if (num >= 11 && num <= 100) {
			System.out.println(num + " is a medium number");
		} else if (num >= 101 && num <= 1000) {
			System.out.println(num + " is a large number");
		} else if (num <= 0) {
			System.out.println(num + " is a negative number");
		} else {
			System.out.println(num + " is a extra large number");
		}
	

	}

}
