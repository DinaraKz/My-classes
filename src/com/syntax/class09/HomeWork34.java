package com.syntax.class09;
public class HomeWork34 {
	public static void main(String[] args) {
		//3.Print the following pattern:
		//*
		//**
		//***
		//****
		//*****
		
		//4.Print the following pattern:
		//55555
		//4444
		//333
		//22
		//1
		System.out.println("------Triangle Pattern-----");
		for (int r=1; r<=5; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print("*");
				}
			System.out.println();
		}
		for (int r1=4; r1>=1; r1--) {
			for(int c1=1; c1<=r1; c1++) {
				System.out.print("*");
				}
			System.out.println();
		}
		System.out.println("------55555/4444 Pattern-----");
		for (int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
				System.out.print(a);
				}
			System.out.println();
		}
		
		System.out.println("------54321/4321 Pattern-----");
		for (int a1=5; a1>=1; a1--) {
			for(int b1=a1; b1>=1; b1--) {
				System.out.print(b1);
				}
			System.out.println();
		
		}
		System.out.println("------last  Pattern-----");	
			for (int a2=1; a2<=4; a2++) {
				for(int b2=a2; b2>=1; b2--) {
					System.out.print(b2);
			}
				System.out.println();
			}
					for (int a3=5; a3>=1; a3--) {
				for(int b3=a3; b3>=1; b3--) {
					System.out.print(b3);
					}
				System.out.println();
		}
	}	
	}
