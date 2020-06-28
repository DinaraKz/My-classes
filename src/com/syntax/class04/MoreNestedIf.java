package com.syntax.class04;

public class MoreNestedIf {
	public static void main(String[] args) {
		//lets have a date of month and a day of week
		//if it is a Friday --> we watch movie
		//                      if date  is 13 --> watch a scary movie
		//                      if date isnot 13 --> watch a comedy
		// if it is not Friday we are going to study Java
		
		boolean isFriday = true;
		int date = 17;
		
		if (isFriday) {
			System.out.println("It is Friday. We watch movie");
			if (date==13) {
				System.out.println("I will watch SCARY movie");
			} else {
				System.out.println("I will watch COMEDY");
				}
			
		}else {
			System.out.println("It is not Friday. We study Java");
		}
		
		
		
	
		
		
	}

}
