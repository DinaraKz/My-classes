package com.syntax.class04;

import java.util.Scanner;

public class HomeWork3 {
		//Create a Java program that will ask user to input city and temperature. 
		//Your program should convert Fahrenheit into celsius and 
		//print “The temperature in the city __ is __”
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your city, please");
			String city = scan.nextLine();
			
			System.out.println("Enter a temperature in your city (Farenheit)");
			double temp = scan.nextDouble();
			double tempCels = (temp - 32)*5/9;
			
			System.out.println("The temperature in the city " + city + " is " + tempCels);
			
				}
		
		
	}


