package com.syntax.class14;

public class MoreStringMethods {
	public static void main(String[] args) {
		System.out.println("*************.charAt() method***************");
		String season="Summer";
		char character=season.charAt(1);
		System.out.println(character);
		
		System.out.println("*************.indexOf() method***************");
		int index=season.indexOf('S');
		System.out.println(index);
		
		String hello="Hello Ksenia";
		int indexOfKsenia=hello.indexOf("Ksenia");
		System.out.println("Index of Ksenia in the String "+hello+" is = "+indexOfKsenia);
		
		System.out.println("*************.substring() method***************");
		String message="You guys are awesome";
		
		String substring=message.substring(4);//take String starting from index 4
		System.out.println(substring);
		
		String middleWord=message.substring(4, 10);
		System.out.println(middleWord);
		
	}

}
