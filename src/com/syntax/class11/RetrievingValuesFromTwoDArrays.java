package com.syntax.class11;

public class RetrievingValuesFromTwoDArrays {
	public static void main(String[] args) {
		//put the month for each season in one row
		String[][] months = {
				{"December", "January", "February"},
				{"March", "April", "May"},
				{"June", "July", "August"},
				{"September", "October", "November"},
				};
		int rows = months.length; //how many arrays are inside, how many rows?
		System.out.println(rows+" seasons");
		int winterLength = months[0].length;//how many elements/columns are in row with index 0?
		System.out.println(winterLength+" months in Winter/row 0");
		int lastRowSize = months[rows-1].length;
		
		//nested loops are married to 2d arrays
		for(int row=0; row<months.length; row++) {//iterating over rows
			for(int col=0; col<months[row].length; col++) {//iterating over columns
				System.out.print(months[row][col]+" ");
			}
		}
		
	}

}
