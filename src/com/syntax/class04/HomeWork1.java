package com.syntax.class04;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String[] args) {
		//You are a loan specialist and you need to ask user what is 
		//the amount of loan is needed. If loan is less or equal to 200,000 
		//then you would lend the money otherwise you would reject the client.
		
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Please enter amount of loan is needed");
				int amount = scan.nextInt();
				if (amount <=200000) {
					System.out.println("Your loan amount is " + amount + "." + " Approved");
					}else {
					System.out.println("Your loan amount is " + amount + "." + " Rejected");
					}
				
				
	}			
	}



