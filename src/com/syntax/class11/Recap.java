package com.syntax.class11;

public class Recap {
	public static void main(String[] args) {
		int[] grades = new int[5];
		
		int size = grades.length;
		System.out.println("Array size is: "+size);
		
		grades[4] =90;
		grades[3] =85;
		grades[2] =92;
		grades[1] =75;
		grades[0] =100;
		
		//what is the average of the class?
		//1st silly way
		int average = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/size;
		System.out.println("Class average is: "+average);
		
		//2nd best way
		int total =0;
		for (int k=0; k<size; k++) {
			total +=grades[k];
		}
		System.out.println("Class average is: " +total/size);
		
		System.out.println("*************************");
		String[] cities = {"Moscow", "Tampa", "Jacksonville", "Arlington", "Kiev", "Chicago"};
		//I live in Jacksonville
		System.out.println("I live in "+cities[2]);
		
		int i =1;
		System.out.println("I live in "+cities[i]);
		
		i +=2;
		System.out.println("I moved in "+cities[i]);
		
		int cityLenght =cities.length;
		System.out.println("Total number of cities: "+cityLenght);
		
		System.out.println("The last city in the list is: "+cities[4]);
		//add Chicago
		System.out.println("The last city in the list is: "+cities [cityLenght-1]);
		System.out.println("The previosly city in the list is: "+cities [cityLenght-2]);
		
		System.out.println("*************************");
		//I want to print all cities in the list
		//cities[0], cities[1], ...cities[5]
		for (int j=0; j<cityLenght; j++) {
			System.out.println(cities[j]);
}
		System.out.println("*************************");
	}
	

}
