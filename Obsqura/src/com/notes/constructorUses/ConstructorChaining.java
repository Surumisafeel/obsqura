package com.notes.constructorUses;
/*2.Constructor chaining is a process of calling one constructor
from other constructor of a class on an object.
*/
public class ConstructorChaining {
	
	ConstructorChaining(){
		this("Surumi", 30);//Executes 3rd
		System.out.println("Defailt Constructor");
		
	}
	ConstructorChaining(String name, int age){
		this("Safeel",33,'M');//Executes second
		System.out.println("Student name is " +name);
		System.out.println("Student age is " +age);
	}
	ConstructorChaining (String name , int age, char gender){
		System.out.println("Student age is " + age +" name is " +name + " gender is" +gender);//Execute First
	}
	public static void main(String[] args) {
		ConstructorChaining obj = new ConstructorChaining();
		ConstructorChaining obj1 = new ConstructorChaining("Mehrin",3,'F');//Executes last
		
		
	}

}
  