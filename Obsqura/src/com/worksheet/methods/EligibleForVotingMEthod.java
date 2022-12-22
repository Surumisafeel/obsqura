package com.worksheet.methods;
/*Write a program to check whether the candidate is eligible for Voting(Use static method and 
boolean return type).
*/

import java.util.Scanner;

public class EligibleForVotingMEthod {
	static boolean VotingCheck(){
		boolean flag;
	System.out.println("Enter Candidates age");
	Scanner sc = new Scanner(System.in);
	int age = sc.nextInt();
		if (age>18){
		 flag =true;
		}
		else
		flag=false;
	
		return flag;
	

		
	}
	

	public static void main ( String[] args){
		
			boolean check =VotingCheck();
			if (check ==true){
				System.out.println("Eligible");
			}
			else 
				System.out.println("Not Eligible");
			
}
}