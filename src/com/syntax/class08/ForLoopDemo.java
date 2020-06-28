package com.syntax.class08;

public class ForLoopDemo {
	public static void main(String[] args) {
		//String name = "John Doe";
		//String add = "XYZ Road";
		//for(int i=0; i<5; i++) {
		//	System.out.println(name);
		//	System.out.println(add);
		//	}
		/*
		 * 1. initialization
		 * 2. condition
		 * 3. increment/decrement
		 */
		
		
		//for (//initialization; condition;increment/decrement;) 
			
		int num = 10;
		for(int i=1; i<=10; i++)	{
			System.out.println(i+"*"+num+"="+i*num);
		}
		System.out.println("************************");
		
		for (int i=0; i<=12; i++) {
			if (i==5) {
				System.out.println("click element");
			}
			System.out.println(i);
		}
	System.out.println("outside of loop");
	
	
	
	
	}

}
