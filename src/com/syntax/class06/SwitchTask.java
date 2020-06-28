package com.syntax.class06;

import java.util.Scanner;

public class SwitchTask {
	
	public static void main(String[] args) {
		//Ask user to enter their country and capture it. 
		//Once values are captured print which language user speaks.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your country:");
		System.out.println();
		String country = scanner.nextLine();
		String language;
	

		switch (country) {
		case "Russia":
			language = "Russian";
			break;
		case "USA":
			language = "English";
			break;
		case "Kazakhstan":
			language = "Kazakh";
			break;
		case "Liberia":
			language = "Liberian";
			break;
		default:
			language = "Enter another country please";
		} 
		System.out.println("You can speak " + language);

	}
}
