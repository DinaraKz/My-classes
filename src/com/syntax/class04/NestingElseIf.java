package com.syntax.class04;

public class NestingElseIf {
	public static void main(String[] args) {
		//if student completed the quiz we'll check the score
		//if score >90 Great Job!
		//if score>80 well done!
		//if score >70 Passed
		//otherwise You failed
		// if the student didn't complete the quiz, Please finish your Quiz!
		
		boolean completed = true;
		int score = 75;
		
		if (completed) {
			System.out.println("Let's check the Score!");			
			
		if (score>=90) {
				System.out.println("Great Job!");
		} else if (score>=80) {
			System.out.println("Well done!");
		} else if (score>=70) {
			System.out.println("Passed!");
		} else {
			System.out.println("You failed");
		}	
		} else {
			System.out.println("Please finish your Quiz!");
		}
	}
		}
		

