package com.method.review;
//1.Write a java program to add two numbers in a method and return the result to the main method


public class Question1 {
	 int add(int a ,int b){
		
		int sum = a+b;
		return sum;
		
		
	}
	public static void main(String[] args) {
		Question1 obj =new Question1();
		obj.add(2,3);
		int result = obj.add(2,3);
		System.out.println(result);
		
		
	}

}
