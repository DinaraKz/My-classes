package com.syntax.class10;

public class DollarMagic {
	public static void main(String[] args) {
		//$$$$
		//$  $
		//$  $
		//$  $
		//$$$$
		
		for(int r=1; r<=5; r++) {
			for(int c=1; c<=4; c++) {
				if(r==1||r==5) {//in the first or last row print everything
					System.out.print("$");
				}else {//in the other rows
					if(c==1||c==4) {//in first or last column print $
						System.out.print("$");
					}else {//in the other columns print space
						System.out.print(" ");
					}
								}
							}
			System.out.println();
		}		
		
		//HM re-do this task without using nested if
		//hint you shoulf use logical operators && + ||
		//
		
	}

}
