package com.syntax.class05;

import java.util.Scanner;

public class Task2 {
	
	//Write a program that will print whether it is a weekend or weekday. 
	//If any day from 1-5 → output "It is a weekday", 
	//Anyway from 6-7 → output "It is a weekend", 
	//any other day → output "Invalid day"
	
	public static void main(String[] args) {
		
		int day = 4;
		System.out.println("_________using AND________");
		if(day>=1 && day <=5) {
			System.out.println("It is a weekday");
		}else if (day >=6 && day <=7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
		System.out.println("_________using OR________");
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
				
		System.out.println("_________mixing AND with OR________");
		if(day>=1 && day <=5) {
			System.out.println("It is a weekday");
		}else if (day==6 || day==7) {
			System.out.println("It is a weekend");
		}else {
			System.out.println("Invalid day");
		}
		
				
				
		
		
		
	}

}
