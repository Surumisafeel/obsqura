package com.worksheet.methods;

public class AverageAndAreaParameterizedConstructor {

	 AverageAndAreaParameterizedConstructor(int a,int b, int c){
		int averageint = (a+b+c)/3;
		System.out.println("Average of integres is " +averageint);
		}
		 AverageAndAreaParameterizedConstructor(float a,float b, float c){
			float averagefloat = (a+b+c)/3;
			System.out.println("Average of integres is " +averagefloat);
			}
		 AverageAndAreaParameterizedConstructor(float a){
			
			float areaofcircle = 3.14f*a*a;
			System.out.println("areaofcircle " +areaofcircle);
		}
		 AverageAndAreaParameterizedConstructor(int a){
			int areaOfSquare = a*a;
			System.out.println("areaOfSquare " +areaOfSquare);
		}
		 AverageAndAreaParameterizedConstructor(int a, int b){
			int areaofRectangle =a*b;
			System.out.println("areaofRectangle " +areaofRectangle);
		}
		public static void main(String[] args) {
			AverageAndAreaParameterizedConstructor obj = new AverageAndAreaParameterizedConstructor(1,2,4);
			AverageAndAreaParameterizedConstructor obj1 = new AverageAndAreaParameterizedConstructor(1.2f,2.2f,4.4f);
			AverageAndAreaParameterizedConstructor obj2 = new AverageAndAreaParameterizedConstructor(1.1f);
			AverageAndAreaParameterizedConstructor obj3 = new AverageAndAreaParameterizedConstructor(10);
			AverageAndAreaParameterizedConstructor obj4 = new AverageAndAreaParameterizedConstructor(10,20);
		
}
}
