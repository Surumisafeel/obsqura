package com.worksheet.methods;

import java.util.Scanner;

/*Write a program to check whether the customer have discount (get 20% discount if total amount 
is greater than 5000) or not and get the final amount in main method. (static methods)
 Get prices of items using parameterized method
 Method 1 - Calculate total amount
 Method 2 - Check discount*/


public class CustomerDiscount {
static int totalAmount;
	static int TotalAmount(int i1,int i2, int i3){
		totalAmount =i1+i2+i3;
		return totalAmount;
		
	}
	
	static void CheckDiscount(){
		if (totalAmount>5000){
			int discount = (totalAmount*20)/100;
			System.out.println("Eligible for discount amount " + discount);
		}
		else 
			System.out.println("Not eligibel for discount");
	}
	
	public static void main(String[] args) {
		System.out.println("Enter price for item1");
		Scanner sc = new Scanner(System.in);
		int item1Price =sc.nextInt();
		System.out.println("Enter price for item2");
		Scanner sc1 = new Scanner(System.in);
		int item2Price =sc.nextInt();
		System.out.println("Enter price for item3");
		Scanner sc2 = new Scanner(System.in);
		int item3Price =sc.nextInt();
		int totalPrice =TotalAmount(item1Price,item2Price,item3Price);
		System.out.println("total price of product is "+totalPrice);
		CustomerDiscount.CheckDiscount();
		
		 
		
	}
}
