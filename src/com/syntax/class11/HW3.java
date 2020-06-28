package com.syntax.class11;

public class HW3 {
	public static void main(String[] args) {
		//Create a 2D array or integer type where you will store 
		//odd and even numbers in 3 rows and 4 columns. 
		//Develop a program which will identify/print the even numbers only.
		
		int[][] num= {{10,20,29,27},{14,1,9,28},{1,5,14,4}};
		for(int i=0; i<num.length;i++) {
			if(num%2=0) {
				
			}
		for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	
		
	}

}
