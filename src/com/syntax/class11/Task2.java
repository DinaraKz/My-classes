package com.syntax.class11;

public class Task2 {
	public static void main(String[] args) {
		//create an array of integers and calculate the sum of all elements in an array
		
		int[] digits = {180,167,146,116};
		int sum =0;
		
		for(int num:digits) {
			sum += num;
		}
		System.out.println("The sum of all digits is "+sum);
		
		int total=0;
		for (int i=0; i<digits.length; i++) {
			int num = digits[i];
			total +=num;
		}
		System.out.println("The total of all numbers is: " +total);
		
		
	}

}
