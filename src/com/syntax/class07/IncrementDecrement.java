package com.syntax.class07;

public class IncrementDecrement {
	public static void main(String[] args) {
		int x = 10;
		x = x + 1;
		x += 1;
		//another way to add 1 into the VARIABLE
		x++;//post-increment (increment - prirost)
		++x;//pre-increment first add then print
		System.out.println(x);
		
		int y = 50;
		y = y-1;
		y-=1;
		y--;		
		System.out.println(y);
		
		int z = 5;//pre increment
		if (++z == 6) {
			System.out.println("Hi");
		}
		
		int k = 10;//post increment
		if (k++ == 11) {
			System.out.println("Neil was here");
		}
		
		
		
	}

}
