package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {
	//Write a program for user to enter his/hers birth month. 
	//Based on the month define the season.
	//Example: if user is born in June, July or August →season =”Summer”.
	//At the end of the program we should see output as “You were born ______”.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please, enter your month of birth!");
		
		String month = scan.next();
		String season = null;
		
		if(month.equals ("December") || month.equals("January") || month.equals("February")) {
			season = "Winter";
		}else if (month.equals ("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		}else if (month.equals ("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		}else if (month.equals ("September") || month.equals("October") || month.equals("November")) {
			season = "Autumn";
		}
		System.out.println("You were born at " + season);
		
	}
	
	
}
