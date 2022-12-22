package com.worksheet.workout;

/*Example 7 : Write a program to check whether the candidate 
is eligible for driving license. */

import java.util.Scanner;

public class EligibleForDrivingLicence{
	public static void main ( String[] args){
		System.out.println("Enter Candidates age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
			if (age>18){
			System.out.println("Candidate is eligible for Driving Licence");
			}
			else
			System.out.println("Candidate is not eligible for Driving Licence");
	}		
}			