package com.syntax.class09;

public class HomeWork12 {
	public static void main(String[] args) {
		//Print the following pattern:
		//54321
		//54321
		//54321
		//54321
		//Print the following pattern:
		//55555
		//44444
		//33333
		//22222
		//11111
		System.out.println("*****Pattern 54321*****");
		for (int e=1; e<=5;e++) {
			
			for(int r=5; r>=1; r--) {
				System.out.print(r);
				}
			System.out.println();	
		}	
		
		System.out.println("*****Pattern 55555/44444*****");
		for (int a=5; a>=1;a--) {
			
			for(int b=1; b<=5; b++) {
				System.out.print(a);
				}
			System.out.println();	
		}		
		
		
		
		
		
		
	}

}
