package com.worksheet.methods;

import java.util.Scanner;

/*Program to calculate discount
If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%
 Should use two classes, Onseason and Offseason
 Use two methods- discount(method name should be same)*/
public class Assignment38_Offseason extends Assignment38_OnSeason {
	int selection;
	int price =5000;
	double discount;
	void Discount(){
	
		if (selection==1){
			discount = price*.4;
			System.out.println("Since this is off season , you got 15% "+ discount);
		}else
			
		{
			super.Discount();
		}
		
	}
	
	
	
public static void main(String[] args) {
	Assignment38_Offseason obj = new Assignment38_Offseason();
	
	System.out.println("Select Season :: Off season-1 : On Season -2");
	
	Scanner sc = new Scanner(System.in);
	obj.selection = sc.nextInt();
	obj.Discount();
	
		
	}

}
