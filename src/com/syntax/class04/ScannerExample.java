package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		//capture the name from the user and print
		//your name is___
		//ask user to enter the age and print 
		//your name is ___ and age is___
		
		//We bring the Scanner Class to our program
		//System.in->read from keyboard/console
		
		Scanner input = new Scanner (System.in);
		
		//We are instructing the user what to enter
		System.out.println("Please enter your full name!");
		//we are capturing the whole line into a text v ariable
		String name = input.nextLine();
		System.out.println("Your name is " + name);
		
		//we are instructing the user what to enter
		System.out.println("Please enter your age!");
		//we are capturing the text as double
		//if it is not a double, then an error/exception will be printed
		double albanianAge = input.nextDouble();
		System.out.println("Your name is_" + name + " and age is " + albanianAge);
		
		
	}

}
