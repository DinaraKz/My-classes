package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {
	public static void main(String[] args) {
		//ctrl + shift + o
		Scanner scan = new Scanner(System.in);
		
		//ask the user to enter 2 numbers
		//compare the numbers and print which one is larger
		
		System.out.println("Please enter a numbers");
		int num1 = Scanner.nextInt();
		System.out.println("Please enter another numbers");
		int num2 = Scanner.nextInt();
		System.out.println("-------------");
		System.out.println("numbers are "+num1+" and "+num2);
		System.out.println("-------------");
		
		if (num1>num2) {
			System.out.println(num1+" is larger than "+ num2);
		}else if (num1<num2) {
			System.out.println(num1+" is smaller than "+ num2);
		}else {
			System.out.println(num1+" is equal to "+ num2);
		}
		
		
		
	}

}
