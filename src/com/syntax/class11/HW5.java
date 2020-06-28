package com.syntax.class11;

public class HW5 {
	public static void main1(String[] args) {
		//Create a 2D array of integer type with 3 rows and 4 columns 
		//and print all values of the whole array.
	
			 int[][] a = {
						{1,1,2}, //sum = 4
						{3,1,2}, //sum = 6
						{3,5,3}, //sum = 11
						{0,1,2}  //sum = 3
					};
	
		int sum=0;
		for(int i=0; i<a.length; i++) {
			System.out.println();
			for(int j=0; j<a[i].length; j++) {
				sum+=a[i][j];
			}
		}
			 System.out.println(sum);
			 
	}

}
