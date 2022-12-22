package com.worksheet.workout;

//Example18. Write a program to sum up all the elements of an array.


public class SumOfArray {
	public static void main(String[] args) {
		int sum= 0;
		int [] numbers = {2,3,4,5};
		for (int i=0;i<numbers.length;i++)
		{
			sum += numbers [i];
		}
		System.out.println("Sum of number in given array is " +sum);
	}

}
