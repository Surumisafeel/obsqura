package com.worksheet.methods;
/*Write a program to set your name and age by a static method and get them in an another static 
method.*/
public class SetAgeAndNameStaticMethod {
	
	static void PersonalDetails (){
	String name = "Surumi";
	int age = 30;
	System.out.println("name is " +name +" and age is " + age);
	}

	public static void main(String[] args) {
		SetAgeAndNameStaticMethod.PersonalDetails();
		
	}
}
