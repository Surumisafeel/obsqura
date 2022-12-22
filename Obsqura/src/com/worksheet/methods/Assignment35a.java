package com.worksheet.methods;

import java.util.Scanner;

/*Program to find the factorial of a number
 Two methods, one for find calculate and other for print result.
 Pass the number as argument
 Main method allows to invoke only one method*/

public class Assignment35a {
	int num;
	int fact;

	void calculation(int num) {

		 fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}

		System.out.println("Factorail of number" + fact);
	}

	void print(int num) {
		this.calculation(num);
		System.out.println("Factorail of number" + num + "is" + fact);

	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Assignment35a obj = new Assignment35a();
		Scanner sc = new Scanner(System.in);
		obj.num = sc.nextInt();
		obj.print(obj.num);

	}

}
