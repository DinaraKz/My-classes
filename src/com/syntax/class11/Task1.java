package com.syntax.class11;

public class Task1 {
	public static void main(String[] args) {
		// create an array of cars and store 6 elements into it.
		//print all values from the array.
		
		String[] cars = {"BMW", "Toyota", "Lexus", "Peugeot", "Hyundai", "Rover"};
		System.out.println("******First way******");
		for (int i=0; i<cars.length; i++) {
			if(cars[i].equals("Lexus")) {
				System.out.println(cars[i]+" is my favorit car");
			}
			System.out.println(cars[i]);
		}
		System.out.println();
			System.out.println("******Second way******");
		for (String c:cars) {
			if(c.equals("Lexus")){
				System.out.println(c+" is my favorite car");
				}else {
			}
			System.out.println(c+" ");
			
	}
		
		
		
	}

}
