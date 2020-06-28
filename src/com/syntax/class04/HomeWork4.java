package com.syntax.class04;

import java.util.Scanner;

public class HomeWork4 {
	//Create a Java program that will ask if user has a credit card or not. 
	//If you user does not have a credit card then offer them. 
	//If they do have one ask what is balance on the card? 
	//If balance of the card is larger than 1000, tell them to pay off immediately, 
	//otherwise you can tell them that they can spend more.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have a credit card? Answer YES or NO, please");
		String answer = scan.nextLine();
		boolean hasCard = false;
		
		if (hasCard) {
			System.out.println("Can I offer you one?");
			} else {
			System.out.println("What is the balanse on your card?");
			}
			double bal = scan.nextDouble();
			if (bal >=1000) {
				System.out.println("Pay off immediately, please!");
			} else {
				System.out.println("You can spend more");}
			}
		}
		


