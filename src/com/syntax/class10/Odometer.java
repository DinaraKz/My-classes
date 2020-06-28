package com.syntax.class10;

import java.util.Scanner;

public class Odometer {
	public static void main(String[] args) {
		//we bought a car
		//it starts with 0000 mileage and it increases
		//it goes 0001, 0002, 0003... to 9999
		//pls print every mileage
		//hint: there are 4 inner loops
		
		
		for(int i=0; i<=9; i++) {//row
			System.out.println("mileage is");
			for(int j=0; j<=9; j++) {//iterations inside
				for(int k=0; k<=9; k++) {
					for(int m=0; m<=9; m++) {
						System.out.println(i+""+j+k+m);//""- for printing digits as digits,not sum of i,j,k,m
					}
				}
				
				}
			
		}
		
		
		
	}

}
