package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		int a = 65;
		String str = "bla"; 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please write some text and press Enter");
		String text = scan.nextLine();
		System.out.println("----------");
		System.out.println(text);
		
		//int a = 33.4 //compile time error
		
		// let me read an integer (age)
		System.out.println("Pls Enter your age! It should be a number");
		int age = scan.nextInt();//if not an integer, run time error
		System.out.println("The age that you enetered is " + age);
	}

}
