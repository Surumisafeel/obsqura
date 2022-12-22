package com.worksheet.methods;

import java.util.Scanner;

/*Program to withdraw amount from an ATM
 Class 1- Bank
One method to set pin from „User‟ class and validate Pin in another method
[Valid pins – 1001, 1234, 1212]
Pin number should declared as private
 Class 2 – User
Get the pin from User*/
public class Assignment_User {
	

	public static void main(String[] args) {
		
		//System.out.println("Enter the pin");
		
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
		Assignment39_Bank bnk = new Assignment39_Bank();
		bnk.setpin(pin);
		System.out.println("User entered pin is "+ bnk.getpin());
		bnk.validate();
	}

}
