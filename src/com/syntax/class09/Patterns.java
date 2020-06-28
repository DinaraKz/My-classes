package com.syntax.class09;

public class Patterns {
	public static void main(String[] args) {
		//i want to print
		//*****
		//*****
		//*****
		//*****
		
		//silly way
		//for(int i=1; i<=4; i++) {
		//	System.out.println("*****");
			
		//1st way
		for (int i=1; i<=4; i++) {
			
			for(int l=1; l<=5; l++) {
				System.out.print("*");
				}
			System.out.println();	
		}

		//2nd way
		for (int z=4; z>=1; z--) {
			
			for(int x=1; x<=5; x++) {
				System.out.print("*");
				}
			System.out.println();	
		}
		//task
		System.out.println("Pattern 10X10");
		for (int q=1; q<=10; q++) {
			
			for(int w=1; w<=10; w++) {
				System.out.print("*");
				}
			System.out.println();	
		}		
		//task
		System.out.println("Pattern 12345 ");
		for (int e=1; e<=3;e++) {
			
			for(int r=1; r<=5; r++) {
				System.out.print(r);
				}
			System.out.println();	
		}		
		//task
				System.out.println("Pattern 11111/22222 ");
				for (int a=1; a<=3;a++) {
					
					for(int s=1; s<=5; s++) {
						System.out.print(a);
						}
					System.out.println();	
				}		
		
		
		
		
		}
	
	}


