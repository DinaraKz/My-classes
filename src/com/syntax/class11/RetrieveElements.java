package com.syntax.class11;

public class RetrieveElements {
	public static void main(String[] args) {
		//print all grades
		char[] grades = {'A', 'B', 'C', 'D', 'F'};
		for (int i=0; i<grades.length; i++) {
			System.out.print(grades[i]+" ");
}
		System.out.println();
		System.out.println("******Print using advanced/enhanced loop*******");
		for (char element:grades) {
			System.out.print(element+" ");
		}
		System.out.println();
	System.out.println("*****************************");
	
	String[] fruits = {"Apple", "Orange", "Grapes", "Banana", "Cucumber", "Peach"};
	//print all the fruits in 2 different ways
		
	System.out.println("******First way******");
	for (int i=0; i<fruits.length; i++) {
		if(fruits[i].equals("Grapes")) {
			System.out.println(fruits[i]+" is my favorit fruit");
		}
		System.out.println(fruits[i]);
	}
	System.out.println();
		System.out.println("******Second way******");
	for (String f:fruits) {
		if(f.equals("Grapes")){
			System.out.println(f+" is my favorite fruit");
			}else {
		}
		System.out.println(f+" ");
		
}
		
	}
	}

