package com.syntax.class08;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		
		//Write a program that reads a range of integers (start and end point), 
		//provided by a user and then from that range prints the sum of the even and odd integers.
		
		Scanner scanner = new Scanner(System.in);
		int start;
		int end; 
		int sumEven=0;
		int sumOdd=0;
		System.out.println("Please enter a starting number");
		start=scanner.nextInt();
		
		System.out.println("Please enter a ending number");
		end=scanner.nextInt();
		
		for (int i=start; i<=end; i++) {
			if (i%2==0) { //even
				sumEven+=i;
			}
			if (i%2==1) { //odd
				sumOdd+=i;
		}
			}
		System.out.println("The sum of even numbers is "+sumEven);
		System.out.println("The sum of odd numbers is "+sumOdd);
		}}
		


