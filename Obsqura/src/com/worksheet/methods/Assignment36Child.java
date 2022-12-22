package com.worksheet.methods;
/* Program to check the addition result is divisible by 10
 Class 1
Return addition result of two numbers
 Class 2
Check the addition result is divisible by 10(use super keyword)*/

public class Assignment36Child extends Assignment36Parent {
	
	  void Div(){
		int result= super.sum/10;
		if (result==0){
			System.out.println("number is divisible by 10");
		}else
			System.out.println("number is not divisible");
		
	}
	
	public static void main(String[] args) {
		
		Assignment36Child obj = new Assignment36Child();
		obj.Div();
	}

}
