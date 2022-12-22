package com.worksheet.workout;

//Worksheet 12: Write a program to print Fibonacci series[0 1 1 2 3 5]

public class FibonacciSeries{
	public static void main (String [] args){
		int firstNumber =0;
		int secondNumber =1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		
	
	
		for(int i=1;i<10;i++)
		{
		 int nextNumber = firstNumber + secondNumber; // n= 0+1 =1 > 2 > 3 >2+3 =5
		 firstNumber =secondNumber; //f==1 > 1 > 2
		 secondNumber =nextNumber; //s=1 >2 >3
		 
		 
		System.out.println(nextNumber);
		}
	}
	
}	
