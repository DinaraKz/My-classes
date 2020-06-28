package com.syntax.class04;

public class Homework {
	public static void main(String[] args) {
		//task-2: write a programm to check weather number is positive or negative.
		int num = 90;
		if (num>0) {
			System.out.println("Number is positive!");
		//}else if (num<0) {
		//	System.out.println("Number is negative!");
		}else if (num==0) {
			System.out.println("Number is zero!");
		}else {
			System.out.println("Number is negative!");
		}
		
		//task3: check whether the number is odd or even
		int num3 = 123;
		int remainder = num3 %2;
		if (remainder == 0) {
			System.out.println(num3 + " is even!");
		} else {
			System.out.println(num3 + " is odd!");
		}
	}

}
