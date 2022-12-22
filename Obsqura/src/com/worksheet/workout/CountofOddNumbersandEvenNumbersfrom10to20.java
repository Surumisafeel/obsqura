//Write a program to find the count of even numbers and odd numbers from 10 to 20.

package com.worksheet.workout;

public class CountofOddNumbersandEvenNumbersfrom10to20{
	public static void main (String [] args){
		int countOfOddNum =0;
		int countOfEvenNum =0;
		for (int i=10;i<=20;i++){
			if(i%2==0){
				countOfEvenNum++;
				
			}else
				countOfOddNum++;
			
			
		}
		System.out.println("Count of Even number is " + countOfEvenNum);
		System.out.println("Count of Even number is " + countOfOddNum);
	}

}
