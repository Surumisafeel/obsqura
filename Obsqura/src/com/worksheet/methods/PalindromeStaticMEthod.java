package com.worksheet.methods;

import java.util.Scanner;

/* Write a program to check whether the given number is Palindrome/Not by using static methods.
 Method 1- to find the reverse(pass the number in argument)
 Method 2-to check palindrome /not*/

public class PalindromeStaticMEthod {
	
	static int reverseMethod (int number){
		int reverse =0;
		while (number != 0)
		{
		int remainder = number%10;
		reverse = reverse*10 + remainder;
		number = number/10;
		
		}
		return reverse;
		
	}
	
	
	static void PalindromeCheck(int a,int b){
		if (a == b){
			System.out.println("Given number is palindrome");
			}else
			System.out.println("Given number is not palindrome");
		
	}

	public static void main (String [] args){
	    System.out.println ("Enteryour the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int inputNumber = number;
		int reverse1=PalindromeStaticMEthod.reverseMethod(number);
		
		PalindromeStaticMEthod.PalindromeCheck(reverse1,inputNumber);
	}
}
		



