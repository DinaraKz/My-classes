package com.syntax.class11;

public class Largest {
	public static void main(String[] args) {
		// find the largest number in array
				int[] numbers = {180,167,146,116};
				
				int largest = 0;
				for(int num:numbers) {
					if(num>largest) {
						largest = num;
					}
				}
				System.out.println(largest);
				
				
	}

}
