package com.worksheet.methods;

/* Write a program to find the factorial of a number(static method)
Output – “Factorial of <given number> is <result>.
*/
public class MethodFactorial {
	static void Factorial() {
		int number = 12;
		int fact = 1;
		for (int i = 1; i <= number; i++) {

			fact = fact * i;

		}
		System.out.println(fact);
	}

	public static void main(String[] args) {

		MethodFactorial.Factorial();

	}
}
