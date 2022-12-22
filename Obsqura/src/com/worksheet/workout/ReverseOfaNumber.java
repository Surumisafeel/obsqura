package com.worksheet.workout;

//Worksheet 13.  Write a program to find the reverse of number.



import java.util.Scanner;
public class ReverseOfaNumber{
	public static void main (String [] args){
	    System.out.println ("Enteryour the number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reverse =0;
		int count =0;
		while (number != 0)
		{
		int remainder = number%10;
		reverse = reverse*10 + remainder;
		number = number/10;
		count++;
		}
		System.out.println("Reverse of given is "+ reverse);
		System.out.println("number length "+ count);
		
	}
}