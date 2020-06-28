package com.syntax.class05;

public class LogicalNOT {
	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("-----------------------");
		//if it is not Monday or Friday we have a class
		int day = 5;
		//1st way
				if (day!=1 && day!=5) {
					System.out.println("We have a class");
				}else {
					System.out.println("We are sleeping");
				}
		//2st way
				if (!(day==1) && ! (day==5)) {
					System.out.println("We have a class");
				}else {
					System.out.println("We are sleeping");
				}
		
		//3d way, easy
				if (!(day==1 || day==5)) {
					System.out.println("We have a class");
				}else {
					System.out.println("We are sleeping");
				}
				
	System.out.println("-----------------------");	
	boolean isRaining = false;
	if (!isRaining) {
		System.out.println("No umbrella");
	}else {
		System.out.println("Yes umbrella");
	}
	}
				
	}


