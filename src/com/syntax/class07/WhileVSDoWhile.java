package com.syntax.class07;

public class WhileVSDoWhile {
	public static void main(String[] args) {
		//print hello 3 times
		//while checks soup is hot before eating
		//do while checks soup is hot after eating
		
		int x = 1;
		while (x<=3) {// checks before going into the loop
			System.out.println("Hello");
			x++;
		}
	System.out.println("--------Usin a Do While loop-----------");
	int y = 1;
	do {
		System.out.println("Hello");
		y++;
	}while (y<=3);//checks after going into the loop

	
	
	
	}

}
