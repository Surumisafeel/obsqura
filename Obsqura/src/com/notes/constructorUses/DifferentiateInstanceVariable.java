package com.notes.constructorUses;
/* 1. this can be used to differentiate between instance variables and local variables.
If local variable and instance variables are same then compiler will not be able to distinguish them.*/

public class DifferentiateInstanceVariable {
	int age;
	String name;
	DifferentiateInstanceVariable(String name, int age){
		this.name = name;/*if local variable and instance variable are of same name then we can provide this.instance variable
		                  in order to inform jvm that it is instance variabl*/
		this.age = age;
	

}
	public void display(){
	System.out.println("Student name is "+name);	
	System.out.println("Student age is "+age);
		
	}
	public static void main(String[] args) {
		DifferentiateInstanceVariable obj = new DifferentiateInstanceVariable("surumi",30);
		obj.display();
		
	}
		
	}
