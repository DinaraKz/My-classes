package com.syntax.class04;

import java.util.Scanner;

public class HomeWork2 {
	//You are DMV representative and you need to ask customer their age. 
	//If they are 18 and older you will issue a driver licence to them,
	//otherwise you will offer them to get a learners permit.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your age, please");
		int age = scan.nextInt();
		if (age >= 18) {
			System.out.println("You are " + age + " and you are eligible to get a driver license.");
		}else {
			System.out.println("You are " + age + " and you are eligible to get a learner's permit ");
			}
		
	}
}
