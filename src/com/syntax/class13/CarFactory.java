package com.syntax.class13;

public class CarFactory {
public static void main(String[] args) {
	//building an object of the car
	Car car1=new Car();
	car1.make="Tesla";
	car1.model="X";
	car1.color="red";
	car1.year=2020;		
	car1.speed=200;
	System.out.println("First car is: "+car1.make+" "+car1.model+" "+car1.color);
	System.out.println("*******Accessing methods from Car class using car1*********");
	car1.drive();
	car1.reverse();
	car1.transportPeople();
	System.out.println();
		
	//building an object of the car
	Car car2=new Car();
	car2.make="BMW";
	car2.model="M5";
	car2.color="blue";
	car2.year=2018;		
	car2.speed=240;
	System.out.println("Second car is: "+car2.make+" "+car2.model+" "+car2.color);
	System.out.println("*******Accessing methods from Car class using car2*********");
	car2.drive();
	car2.reverse();
	car2.transportPeople();
	System.out.println();
	
	Car car3=new Car();
	car3.make="Toyota";
	car3.model="Camry";
	car3.color="brown";
	car3.year=2014;		
	car3.speed=210;
	System.out.println("Third car is: "+car3.make+" "+car3.model+" "+car3.color);
	System.out.println("*******Accessing methods from Car class using car3*********");
	car3.drive();
	car3.reverse();
	car3.transportPeople();
	System.out.println();
	
	Car car4=new Car();
	car4.make="Lexus";
	car4.model="CT 200";
	car4.color="silver";
	car4.year=2015;		
	car4.speed=240;
	System.out.println("Fourth car is: "+car4.make+" "+car4.model+" "+car4.color);
	System.out.println("*******Accessing methods from Car class using car4*********");
	car4.drive();
	car4.reverse();
	car4.transportPeople();
	
	//new Bus(); compiler give an error
	//because we never created a Bus class
	
	
}
}
