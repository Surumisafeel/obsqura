package com.method.review;
//.Write a java class to illustrate the use of local variable,static variable and 
//instance variable.And print the values using main method except local variable
public class Question3 {
int a =6;
static int b=10;


public static void main(String[] args) {
	int c=5;
	System.out.println("Static variable " +Question3.b); // static 
	Question3 obj = new Question3();
	System.out.println("Instance Variable " +obj.b); //instance
	System.out.println("Local Variable "+c);
}
}
