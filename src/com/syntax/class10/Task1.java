package com.syntax.class10;

public class Task1 {
	public static void main(String[] args) {
		//1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] chars = new char[6];//index from 0 to 5
		chars[0] = 'A';
		chars[1] = 'B';
		chars[2] = 'C';
		chars[3] = 'D';
		chars[4] = 'E';
		chars[5] = 'F';
		System.out.println(chars[1]);
		
		
		char[] chars2 = {'A', 'B', 'C', 'D', 'E', 'F'};		
		System.out.println(chars2[1]);
		
		
		
	}

}
