package com.worksheet.workout;

/*Worksheet 6:Write a program to check the given number is positive*/
import java.util.Scanner;
public class CheckNumberIsPositiveOrNot{
	public static void main (String [] args){
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
			if (number > 0) {
			System.out.println("Number is positive");
			}
				else
					if (number <= 0){
					System.out.println("Number is not positive");
					}
				
				
	}	
}		