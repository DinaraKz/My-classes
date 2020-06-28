package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		//we have 7 days of week
		//if day is 2,4 --> SDLC class
		//if day is 6,7 --> Java class
		//if day is 3 --> Review class
		//if day is 1,5 --> No class
		
		int day = 9;
		//to compare the equality of 2 numbers we use ==
		
		if (day==2 || day==4) {
			System.out.println("SDLC class");
		}else if (day==6 || day==7) {
			System.out.println("Java class");
		}else if (day==1 || day==5) {
			System.out.println("No class");
		}else if (day==3){
			System.out.println("Review class");
		}else {
			System.out.println("Wrong day");
		}
		
		System.out.println("----------Using String----------");
		//to compare the equality of 2 Strings we use .equals()
		
		String day2 = "Saturday";
		
		if (day2.equals ("Tuesday") || day2.equals ("Thirsday")) {
			System.out.println("SDLC class");
		}else if (day2.equals ("Saturday") || day2.equals ("Sunday")) {
			System.out.println("Java class");
		}else {
			System.out.println("Not implemented");
		}
	}

}
