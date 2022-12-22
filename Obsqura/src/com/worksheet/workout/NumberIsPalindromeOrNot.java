package com.worksheet.workout;

//Worksheet 14: Write a program to check whether the given number is Palindrome/Not.

import java.util.Scanner;
public class NumberIsPalindromeOrNot{
	public static void main (String [] args){
	    System.out.println ("Enteryour the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int inputNumber = number;
		int reverse =0;
		while (number != 0)
		{
		int remainder = number%10;
		reverse = reverse*10 + remainder;
		number = number/10;
		}
		if (reverse == inputNumber){
		System.out.println("Given number is palindrome");
		}else
		System.out.println("Given number is not palindrome");
		
	}
}	
	
