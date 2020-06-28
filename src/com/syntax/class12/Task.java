package com.syntax.class12;

public class Task {
	public static void main(String[] args) {
		//create a 2D array will store different kinds of food
		//and retrieve all values from that array using 2 different loops
		
		String[][] foods = {
				{"Borsh", "Solyanka", "Olivie"},
				{"Burger", "Fries", "HotDog"},
				{"Besh", "Plov", "Manty"},
				};
		int rows = foods.length; //how many arrays are inside, how many rows?
		System.out.println(rows+" kinds of food");
		int russianLength = foods[0].length;
		System.out.println(russianLength+" kinds of Russian dishes");
		int americanLength = foods[1].length;
		System.out.println(americanLength+" kinds of American dishes");
		int kazakhLength = foods[2].length;
		System.out.println(kazakhLength+" kinds of Kazakh dishes");
		
	}

}
