package com.syntax.class05;

import java.util.Scanner;

public class ScannerLogicalOperators {
public static void main(String[] args) {
	//take the age from the user and then print
	//if age 0-3 --> baby
	//if age 4-5 --> kid
	//if age 6-12 --> child
	//if age 13-19 --> teenager
	//if age 20-64 --> adult
	//if age 65 and more --> senior
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please, enter your age!");
	
	int age = scan.nextInt();
	
	if(age>=0 && age <=3) {
		System.out.println("You are baby");
	}else if (age >=4 && age <=5) {
		System.out.println("You are kid");
	}else if (age >=6 && age<=12) {
		System.out.println("You are a child");
	}else if (age>=13 && age<=19) {
		System.out.println("You are a teenager");
	}else if (age>=20 && age<=64) {
		System.out.println("You are an adult");
	}else if (age>=65)
		System.out.println("Enjoy your life");
	
		
	}
	

}
}
