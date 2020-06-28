package com.syntax.class08;

public class HomeWork {
public static void main(String[] args) {
	//Print numbers from 100 to 1
	//Print even numbers from 20 to 1 (2 ways)
		
	for(int i=100; i>=1; i--) {
		System.out.print(i +" ");
	}
	//Print odd numbers between 20 and 50 (2 ways)
	System.out.print("Print odd numbers between 20 and 50 (1st way)");
	for(int i=20; i<=50; i++) {
		if (i%2==1) {//odd number
		System.out.println(i);
		}
	}
	
	System.out.println("Print odd numbers between 20 and 50 (2nd way)");
	for(int i=21; i<=50; i+=2) {
		System.out.println(i);
	}
		System.out.println("Print numbers between 1 and 5");
	for(int j=5; j>=1; j--) {
		System.out.println(j);
		}
	
	System.out.println("What is the result");
	int total = 1;
	for(int k=1; k<=4; k++) {
		total = total+k;
	}
	System.out.println(total);
	}
	
	
	}


