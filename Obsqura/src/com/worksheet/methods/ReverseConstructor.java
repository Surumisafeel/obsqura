package com.worksheet.methods;
/*Program to find the reverse of a number
 Two constructors, one for calculation reverse and other for display “Finding reverse…”
 Argument variable and instance variable should be same
 Main method allows to invoke only one constructor*/

import java.util.Scanner;

public class ReverseConstructor {
	int reverse =0;
	int count =0;
	int number;
	
   
	
	ReverseConstructor(int number){
		this();
		this.number=number;
		System.out.println("number is " + this.number);
		while ( number != 0)
		{
		int remainder = number%10;
		reverse = reverse*10 + remainder;
		number = number/10;
		count++;
		}
		System.out.println(reverse);
	}
	
	
	
	public ReverseConstructor() {
		
		System.out.println("Finding Reverse" );
	}



	



	public static void main(String[] args) {
		System.out.println ("Enteryour the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		ReverseConstructor obj = new ReverseConstructor(number);
	}
}
