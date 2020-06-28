package com.syntax.class10;

public class ArrayAnotherWay {
	public static void main(String[] args) {
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursa", "Friday"};
		//lets print the element with index3
		System.out.println(weekdays[3]);
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
		
		//weekdays[5] = "Saturday"; - it is impossible to add elements to the array - its a garage
		
		
		//1st way
		double[] balances = {10000, 23.50, 5540.5};
		System.out.println("total money is "+(balances[0]+balances[1]+balances[2]));
		//2nd way
		int total1 = (int)balances[0]+(int)balances[1]+(int)balances[2];
		System.out.println("total money is "+total1);
		//3rd way
		int total2 = (int) (balances[0]+balances[1]+balances[2]);
		System.out.println("total money is "+total2);
		
		//dont ever create array with zero elements because you can not add elements later
		int[] numbers1 = new int[0];
		
		int[] numbers2 = {};
		numbers2[0]=5;
		System.out.println(numbers2[0]);
	}

}
