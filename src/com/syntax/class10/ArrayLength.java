package com.syntax.class10;

public class ArrayLength {
	public static void main(String[] args) {
		String[] group1 = new String[5];
		
		group1[0] = "Kamila";
		group1[3] = "Elshan";
		group1[2] = "Yuriy";
		System.out.println(group1[3]);
		System.out.println(group1[2]);
		int arrLenght = group1.length;
		System.out.println("The lenght of the array is "+arrLenght);
		
		System.out.println("************************");
		
		String[] group2 = {"Ksenia", "Olga", "Castro", "Ali"};
		System.out.println("The size of group2 is "+group2.length);
		
		
		
	}

}
