package com.method.review;
//Write a program to add two numbers in a method and display the result in another method

public class Question2 {
	int sum;

	void add(int a, int b) {

		sum = a+b;

	}

	public void display() {

		System.out.println(sum);

	}

	public static void main(String[] args) {

		Question2 obj = new Question2();
		obj.add(4,5);
		obj.display();

	}

}
