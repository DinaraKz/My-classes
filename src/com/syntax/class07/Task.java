package com.syntax.class07;

public class Task {
public static void main(String[] args) {
	int x = 50;
	while (x >=1) {
		System.out.print(x+" ");
		x--;
	}
	
	System.out.println();
	// how to print odds from 1 to 20
	//1,3,5,7...
	
	//1 way using mod(%)
	int y = 1;
	while (y<20) {
		if (y%2 ==1) {
			System.out.print(y+" ");
		}
		y++;
	}
	System.out.println();
	//2 way increasing by 2
		int z = 1;
		while (z<20) {
			if (z<20) {
				System.out.print(z+" ");
			}
			z+=2;
		}
		System.out.println();
		//3 way 
			int q = 0;
			while (q<20) {
				q++;
				System.out.print(q+" ");
				q++;
			}
		
}
}
