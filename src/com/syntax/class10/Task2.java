package com.syntax.class10;

public class Task2 {
	public static void main(String[] args) {
		
		//1.Create an array of names and store all names of your group. 
		//Then print your name from that array. 
		//(use 2 different ways of creating an array).
		
		String[] names = new String[4];//index from 0 to 3
		names[0] = "Dinara";
		names[1] = "Rafael";
		names[2] = "Ilkhan";
		names[3] = "Ilana";
		System.out.println(names[0]);
		
		
		String[] names2 = {"Dinara", "Rafael", "Ilkhan", "Ilana"};		
		System.out.println(names2[0]);
		
		
		
	}

}
