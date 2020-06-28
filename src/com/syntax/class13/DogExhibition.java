package com.syntax.class13;

public class DogExhibition {
	public static void main(String[] args) {
		//Create a Dog Class and create 3 different objects of it: 
		//Husky, Bulldog, Labrador  with specific  attributes and behaviors.
		
		Dog dog1=new Dog();
		dog1.breed="Husky";
		dog1.gender="female";
		dog1.color="gray";
		dog1.age=2;		
		dog1.weigth=30;
		System.out.println("First dog is: "+dog1.breed+" "+dog1.gender+" "+dog1.color);
		System.out.println("*******Accessing methods from Dog class using dog1*********");
		dog1.protect();
		dog1.bite();
		dog1.bark();
		System.out.println();
		
		Dog dog2=new Dog();
		dog2.breed="Bulldog";
		dog2.gender="male";
		dog2.color="brown";
		dog2.age=3;		
		dog2.weigth=40;
		System.out.println("Second dog is: "+dog2.breed+" "+dog2.gender+" "+dog2.color);
		System.out.println("*******Accessing methods from Dog class using dog2*********");
		dog2.protect();
		dog2.bite();
		dog2.bark();
		System.out.println();
		
		Dog dog3=new Dog();
		dog3.breed="Labrador";
		dog3.gender="male";
		dog3.color="brown";
		dog3.age=4;		
		dog3.weigth=34;
		System.out.println("Third dog is: "+dog3.breed+" "+dog3.gender+" "+dog3.color);
		System.out.println("*******Accessing methods from Dog class using dog3*********");
		dog3.protect();
		dog3.bite();
		dog3.bark();
		System.out.println();
		
		
	}

}
