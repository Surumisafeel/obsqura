package com.worksheet.methods;
/*Program to calculate discount
If customer purchase clothes on Offseason, set discount 15% and on Onseason 40%
 Should use two classes, Onseason and Offseason
 Use two methods- discount(method name should be same)*/

public class Assignment38_OnSeason {
	
	void Discount(){
		Assignment38_Offseason obj1 = new Assignment38_Offseason();
		obj1.discount = (obj1.price)*.15;
		System.out.println("Since this is onseason you got " + obj1.discount +" discount");
	}
	
	

}
