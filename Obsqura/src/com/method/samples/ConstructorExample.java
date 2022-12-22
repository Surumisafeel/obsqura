package com.method.samples;

public class ConstructorExample {
	
	ConstructorExample(){
		System.out.println("Default Constructor ");
		
	}
	
	public ConstructorExample(int a, int b){
		int sum = a+b;
		System.out.println("Parameterized constructor "+ sum);
	}
	
	static void addition (int a, int b){
		int sum = a+b;
		System.out.println("static method " +sum);
	}
	int subtraction (int a, int b){
		int Difference = a-b;
		return Difference;
	}
	
	
	
	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample(); 
		ConstructorExample obj1 = new ConstructorExample(10,5); 
		ConstructorExample.addition(3, 6);
		int result =obj.subtraction(7, 6);
		System.out.println("instance method with return type "+result);
	}

}
