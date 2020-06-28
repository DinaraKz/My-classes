package com.syntax.class03;

public class IfCondition {
	public static void main(String[] args) {
		//declare a number and compare if the number is large than 100
		//if it is larger than 100 i will print --> my number is large
		
		int num = 100;
		boolean result = num>100;
		
		System.out.println("Let us check");
		if (num>100) {
		System.out.println("My number is large");
	} else {
		System.out.println("My number is small");
	}
		System.out.println("The check is complete");
		
		System.out.println("-----------");
		int expectedHours = 15;
		int actualHours = 15;
		if (actualHours >= expectedHours) {
			System.out.println("You will love Java");
		} else {
			System.out.println("You will NOT love Java");
		}
		System.out.println("-----------");
		double budget = 15001;
		double carPrice = 15000;
		
		if (budget > carPrice) {
			System.out.println("I will buy this car");
			System.out.println("I am happy");
		}else {
			System.out.println("I will not buy this car");
			System.out.println("I will study Java");
		}
	}	

}
