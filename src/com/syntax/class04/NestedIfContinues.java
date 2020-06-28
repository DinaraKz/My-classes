package com.syntax.class04;

public class NestedIfContinues {
	public static void main(String[] args) {
		//check if petient has allergy
		//if no allergies --> you are healthy
		//otherwise:
		//if peanut allergy: don't eat peanuts
		//if lactose allergy: don't drink milk
		//if bee allergy: dont mess with bees
		//if seafood: don't eat fish
		
		
		boolean isAllergy = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee = true;
		
		if (!isAllergy) {
			//no allergy
			System.out.println("You are healthy");			
			} else {
				//we have to check
				if (peanut) {
				System.out.println("Don't eat peanut");
				}
				if (lactose) {
					System.out.println("Don't drink milk");
				}
				if (bee) {
					System.out.println("Don't mess with bees");
				}
		
		
	}
	}
}
