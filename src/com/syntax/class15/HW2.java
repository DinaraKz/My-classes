package com.syntax.class15;

import java.util.Scanner;

public class HW2 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter father's name: ");
		
		String name1 = scan.nextLine();
		System.out.println("Please enter mother's name:");
		
		String name2 = scan.nextLine();
		System.out.println("Is it boy or girl?");
		
		String gender = scan.nextLine();
		
		String babyName;
		
		
		if (gender.equalsIgnoreCase("boy")) {//ignoreCase Boy or boy
			System.out.println("Congratulations, It is a boy");
			babyName = name1.substring(0, name1.length()/2) + name2.substring(name2.length()/2);
			
		} else if(gender.toLowerCase().equals("girl")){//GIRL-->girl
			System.out.println("Congratulations, It is a girl");
			babyName = name2.substring(0,name2.length()/2) + name1.substring(name1.length()/2);
		}else {
			babyName="unknown";
		}
		System.out.println(babyName.toUpperCase());
		scan.close();
		
		System.out.println("****************");
		String day = "Sunday";
		//String->char->sorry, cannot call String mrthod because you are not a String
		//day.charAt(1).toUpperCase();
		             //String->String->char
		char letter = day.toUpperCase().charAt(1);
		int lengthOfNewDay=day.substring(3).toUpperCase().length();
		System.out.println(lengthOfNewDay);
		
		
	}

	}


