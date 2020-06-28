package com.syntax.class11;

public class HW1 {
	public static void main(String[] args) {
		//Create a 2D array where you will store the following values: 
		//Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		//After storing values print the following:
		//Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
		
		String[][] citizen = {
				{"Mr","Mrs","Miss","Ms"},
				{"Smith","Obama","Jordan","Jackson"}
		};
		System.out.print(citizen[0][1]);
		System.out.println(" "+citizen[1][0]);
		System.out.print(citizen[0][0]);
		System.out.println(" "+citizen[1][1]);
		System.out.print(citizen[0][3]);
		System.out.println(" "+citizen[1][3]);
		System.out.print(citizen[0][2]);
		System.out.println(" "+citizen[1][2]);
	}

}
