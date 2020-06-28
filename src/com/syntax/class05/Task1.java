package com.syntax.class05;

import java.util.Scanner;

public class Task1 {
	
		//Prompt the user to enter person heights in inches. 
		//Person should be classified as one of the following:
		//• short (under 60 inch)
		//• tall (over 72 inch)
		//-----------------------------------------
		
	
		public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, enter your heihgt in inches");
			
		int hi = scan.nextInt();
		
		if(hi<60) {
			System.out.println("You are short");
		}else if (hi >=60 && hi <=72) {
			System.out.println("You are medium");
		}else if (hi > 72) {
			System.out.println("You are tall");
		}
		}
		}		

	

