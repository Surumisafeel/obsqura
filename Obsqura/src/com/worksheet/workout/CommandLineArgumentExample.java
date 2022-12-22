package com.worksheet.workout;

//Worksheet 2 : . Write a program to add two numbers. Accept numbers using command line arguments
public class CommandLineArgumentExample {
	public static void main(String [] args){
		//System.out.println ("Enter first number");
		int firstNumber = Integer.parseInt (args[0]);
		
		int secondNumber = Integer.parseInt (args[1]);
		//System.out.println ("Enter second number");
		int sum = firstNumber + secondNumber;
		System.out.println ("Sum of two numbers is " + sum);
	}	
}		
