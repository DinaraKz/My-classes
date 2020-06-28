package com.syntax.class11;

public class Task3 {
	public static void main(String[] args) {
		//create an array of countries. While retrieving all values from an array 
		//print capital for each country (using if or switch)
		
		String[] countries = {"USA", "Russia", "Kazakhstan", "France"};
		System.out.println("***********Elion way************");
		String[] capitalCities = {"Washington", "Moscow", "Nursultan", "Paris"};
		for(int i=0; i<countries.length; i++) {
			String country = countries[i];
			String city = capitalCities[i];
			System.out.println("The capital city of "+country+" is "+city);
		}
		//HW try to solve this way with enhanced for loop
		//Hint: you should not be able to do it
		//to understand why it is not possible
		
		
		System.out.println("***********The first way************");
		for (String country:countries) {
			if(country.equals("USA")||country.contentEquals("US")) {
				System.out.println("Washington");
			}else if(country.equals("Kazakhstan")) {
				System.out.println("Nursultan");
			}else if(country.equals("Russia")) {
				System.out.println("Moscow");
			}else if(country.equalsIgnoreCase("France")){
				System.out.println("Paris");
			}else {
				System.out.println("The country "+country+" is not in my list");
			}
		}
		System.out.println("*******Another way*********");
		for (int i=0; i<countries.length; i++) {
			String country = countries[i];
			
			if(country.equals("USA")||country.contentEquals("US")) {
				System.out.println("Washington");
			}else if(country.equals("Kazakhstan")) {
				System.out.println("Nursultan");
			}else if(country.equals("Russia")) {
				System.out.println("Moscow");
			}else if(country.equalsIgnoreCase("France")){
				System.out.println("Paris");
			}else {
				System.out.println("The country "+country+" is not in my list");
			}
		}
	
		System.out.println("*******Switch way**********");
		for (int i=0; i<countries.length; i++) {
			switch(countries[i]) {
			case "USA":
				System.out.println("Washington");
				break;
			case "Russia":
				System.out.println("Moscow");
				break;
			case "Kazakhstan":
				System.out.println("Nursultan");
				break;
			case "France":
				System.out.println("Paris");
				break;
			default:
				System.out.println("It is not in my list");
			}
		}
	
	
	
	}
		}
		
		
		
		