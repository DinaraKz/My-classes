package com.syntax.class03;

public class ModulusOperator {
	public static void main(String[] args) {
		double d1 = 12.5;
		double d2 = 4.7;
		double result = d1/d2;
		System.out.println(result);
		System.out.println("-----------------");
		
		double num1 = 12.5;
		double num2 = 4.7;
		double dresult = num1/num2;
		System.out.println("If we divide doubles the result is " + dresult);
			
		System.out.println("-----------------");
		
		float f1 = 12.5f;
		float f2 = 4.7f;
		float fresult = f1/f2;
		System.out.println("float result is " + fresult);
		
		
		System.out.println("-----------------");
		
		
		int i = 16;
		int j = 4;
		int result2 = i/j; //3.5 (it cuts to 1)
	//	double result3 = i/j;
		System.out.println( "The division is " + result2);
	//	System.out.println(result3);
		
		int mod = i % j;
		System.out.println("The remainder is " + mod);
		
		
	}

}
