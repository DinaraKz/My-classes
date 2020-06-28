package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String[] args) {
		// widening, implicit, automatically
		//double d = (double) 7;
		double d = 7;
		System.out.println(d);
		
		//	int i = 7.58; // compile time error -> Type mismatch: cannot convert 
		//from double to int
		
		// narrowing, explicit, manually
		int i = (int) 7.58;
		System.out.println(i);
		
		//narrowing a large number into a byte
		byte b = (byte) 123456;
		System.out.println(b);
		
		long l1 = 45;
		long l2 = 2345674567l;
		
		//you are trying to fit something from 
		//a big box into a small box
		int number1 = (int) l1;
		System.out.println("number1 = " + number1);
		
		int number2 = (int) l2;
		System.out.println("number2 = " + number2);
		
		
	}

}
