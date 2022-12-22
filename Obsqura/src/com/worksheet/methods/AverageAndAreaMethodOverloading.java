package com.worksheet.methods;
/*Write a program to find the
a) Average of three integer numbers, three float numbers(should have same method name)
b) Area of figures(circle, rectangle, square) by using three methods(should have same 
method name)*/

public class AverageAndAreaMethodOverloading {
	
	void average(int a,int b, int c){
	int averageint = (a+b+c)/3;
	System.out.println("Average of integres is " +averageint);
	}
	void average(float a,float b, float c){
		float averagefloat = (a+b+c)/3;
		System.out.println("Average of integres is " +averagefloat);
		}
	void Area(float a){
		
		float areaofcircle = 3.14f*a*a;
		System.out.println("areaofcircle " +areaofcircle);
	}
	void Area(int a){
		int areaOfSquare = a*a;
		System.out.println("areaOfSquare " +areaOfSquare);
	}
	void Area(int a, int b){
		int areaofRectangle =a*b;
		System.out.println("areaofRectangle " +areaofRectangle);
	}
	public static void main(String[] args) {
		AverageAndAreaMethodOverloading obj = new AverageAndAreaMethodOverloading();
		obj.average(2,3,9);
		obj.average(3.4f,5.6f,4.6f);
		obj.Area(3.3f);
		obj.Area(2, 4);
		obj.Area(5);
		
	}

}
