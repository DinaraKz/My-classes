package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
	public static void main(String[] args) {
		
		// we ask users' name 5 times and print Good afternoon 5 times
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		while (num<=5) {
		System.out.println("Please enter your name: ");
		String name = scan.nextLine();
		System.out.println("Good afternoon "+name);
		num++;
		}
		
		int num2 = 1;
		do {
			System.out.println("Please enter your name: ");
			String name = scan.nextLine();
			System.out.println("Good afternoon "+name);
			num++;
		}while (num>5);
		
	}

}
