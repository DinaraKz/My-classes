package com.syntax.class10;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		//room numbers go from 1.1 to 1.7 - 4 floors
		//if I want I can read rows from a Scanner
		
		//Task Ask user how many floors does your hotel have?
		//And how many  rooms in each floor
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter how many floors does your hotel have?");
		int floor = scanner.nextInt();
		System.out.println("enter how many rooms in each floor?");
		int room = scanner.nextInt();
			
		for(int i=1; i<=floor; i++) {//row
			System.out.println("Floor #"+i+"-->");
			for(int j=1; j<=room; j++) {//iterations inside
				System.out.print(i+"."+j+" ");
				}
			System.out.println();
		}
		
	}

}
