package com.syntax.class05;

import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		//1.Write a program to find largest of three double values using 
		//if-else..if and logical operators provided by a user 
		//(numbers must be distinct)
		
		//2.Write a program to find largest number among three numbers 
		//using nested if provided by a user (numbers must be distinct)
		//NOT FINISHED
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();
		
		System.out.println("Please enter the first number:");
		double b = scan.nextDouble();
		
		System.out.println("Please enter the first number:");
		double c = scan.nextDouble();
		
		double largest = 0;
		
		//1st way
		//if(a>b && a>c){
		//	largest = a;
		//}else if (b>a && b>c) {
		//	largest = b;
		//}else if (c>a && c>b) {
		//	largest = c;
		//}
		
		
		//2nd way
		if(a>b && a>c){
		largest = a;
		}else if(b>c) {
		largest = b;
		}else{
		largest = c;
		}
		System.out.println("Largest number is "+ largest);
		
		
	}}
