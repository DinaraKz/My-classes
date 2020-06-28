package com.syntax.class14;

public class StringMethods {
	
	public static void main(String[] args) {
		//1st way ti create a String - is most popular way
		String name="Olga";//literal
		
		//2nd way to create String using new keyword
		String name1=new String();
		name1="Olga";
		
		System.out.println(name);
		System.out.println(name1);
		
		//methods of String class
		String school="Syntax";
		
		System.out.println("*************.length() method*************");
		//tells how many characters are in the String
		int size=school.length();
		System.out.println("The length os the String is: "+size);
		
		String greetings="Hello Syntax";//space calculates as a character
		int sizeOfDifferentString=greetings.length();
		System.out.println(sizeOfDifferentString);
		
		System.out.println("*************.toUpperCase() method*************");
		String city="Washington DC";
		String newCity=city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("*************.toLowerCase() method*************");
		String lowerCaseString=newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		String country="USA";
		String capital="Washington DC";
		
		//+ with Strings serves as concatenation operator
		//+ with numbers serves as arithmetic operator
		System.out.println(country+capital);
		System.out.println(country.concat(capital));//will work only if both values are of String type
		
		int day=27;
		String month=" June ";
		System.out.println(day+month);
		System.out.println(month+day);
		//System.out.println(month.concat(day));//cannot use because both 
		//values must be String
		//System.out.println(day.concat(month));//day is an int type and it does not 
		//have an access to String methods
		
		System.out.println("*************.isEmpty() method*************");
		String str="Hello";
		boolean isEmpty=str.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println("*************.trim() method*************");
		//remove spaces before and after the String
		String cat="my cat name is Jessy";
		String dog=" my dog name is    Charly ";
		System.out.println(cat);
		System.out.println(dog);
		System.out.println(cat.trim());
		System.out.println(dog.trim());
		
	}

}
