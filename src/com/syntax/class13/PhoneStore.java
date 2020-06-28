package com.syntax.class13;

public class PhoneStore {
	private String type;
	private String model;
	private String color;
	private int year;
	private int price;

	//Create a Class “Phone”. 
	//Create 3 Objects of it: iPhone, Android, Nokia 
	//with specific  attributes and behaviors.
	public static void main(String[] args) {
		
		Phone phone1=new Phone();
		phone1.type="iPhone";
		phone1.model="X MAX";
		phone1.color="silver";
		phone1.year=2018;		
		phone1.price=999;
		System.out.println("My husband's phone is: "+phone1.type+" "+phone1.model+" "+phone1.color);
		System.out.println("*******Accessing methods from Phone class using phone1*********");
		phone1.call();
		phone1.text();
		phone1.useInternet();
		System.out.println();
		
		
		Phone phone2=new Phone();
		phone2.type="Android";
		phone2.model="Samsung S8+";
		phone2.color="red";
		phone2.year=2017;		
		phone2.price=800;
		System.out.println("My phone is: "+phone2.type+" "+phone2.model+" "+phone2.color);
		System.out.println("*******Accessing methods from Phone class using phone2*********");
		phone2.call();
		phone2.text();
		phone2.useInternet();
		System.out.println();
		
		
		Phone phone3=new Phone();
		phone3.type="Nokia";
		phone3.model="3310";
		phone3.color="black";
		phone3.year=2000;		
		phone3.price=30;
		System.out.println("My son's phone is: "+phone3.type+" "+phone3.model+" "+phone3.color);
		System.out.println("*******Accessing methods from Phone class using phone3*********");
		phone3.call();
		phone3.text();
		phone3.useInternet();
		System.out.println();
		
		
		
		
	}

	
}
