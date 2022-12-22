package com.worksheet.methods;
/*Program to withdraw amount from an ATM
 Class 1- Bank
One method to set pin from „User‟ class and validate Pin in another method
[Valid pins – 1001, 1234, 1212]
Pin number should declared as private
 Class 2 – User
Get the pin from User*/

public class Assignment39_Bank {
	
	private int pin;
	
	public void setpin(int pin){
		this.pin= pin;
	}
	
	public int getpin(){
		return pin;
		
	}
	
	public void validate(){
		switch(pin){
		case 1001:
			System.out.println("It is a Valid pin");
			break;
		case 1234:
			System.out.println("It is a Valid pin");
			break;
		case 1212:
			System.out.println("It is a Valid pin");
			break;
		default:
			System.out.println("It is a Invalid Pin");
			
		}
			
	}
	
	

}
