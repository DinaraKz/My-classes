package com.syntax.class02;

public class StringConcatenationDemo {
	public static void main(String[] args) {
		//I love Castro
		String name = "Castro";
		System.out.println("I love" + " " + name);
		System.out.println("I love " + name);
		
		// i don't want to change my variables
		String statement = "I love";
		System.out.println(statement + " " + name);
		
		System.out.println("--------------");
		String car = "BMW";
		int year = 2020;
		
		//concatenation of two Strings
		System.out.println("BMW of year " + "2020");
		
		//concatenation of a String with an integer
		System.out.println("BMW of year " + 2020);
		
		//concatenation of a String with a varyable of type integer
		System.out.println("BMW of year " + year);
		
		//concatenation of multiple things
		System.out.println(car + " of year " + year);
	
		
		//Task:
		// 1. My name is __ and my last name is ____ .
		// 2. I live in city of ___ state ___ and my phone number is ___ !
		
		
		System.out.println("--------------");
		
		String name1 = "Dinara";
		String lastName = "Zhansagimova";
		String city = "Jacksonville";
		String state = "Florida";
		String phoneNumber = "7867882826";
		
		
				//concatenation of two Strings
				System.out.println("My name is " + "Dinara " + "and my last name is " + "Zhansagimova" + ".");
				System.out.println("I live in city of " + "Jacksonville " + "state " + "Florida " + "and my phone number is " + "7867882826" + "!" );
				
				//concatenation of a String with an integer
				System.out.println("My name is " + "Dinara" + "and my last name is " + "Zhansagimova" + ".");
				System.out.println("I live in city of " + "Jacksonville " + "state " + "Florida " + "and my phone number is " + "7867882826" + "!");
				
				//concatenation of a String with a varyable of type integer
				System.out.println("My name is " + name1 + "and my last name is " + lastName + ".");
				System.out.println("I live in city of " + city + "state " + state + "and my phone number is " + phoneNumber + "!");
				
				//concatenation of multiple things
				System.out.println("My name is " + name1 + "and my last name is " + lastName + ".");
				System.out.println("I live in city of " + city + "state " + state + "and my phone number is " + phoneNumber + "!");
				
				
			
		
		
		
		
		
		
		
	}

}
