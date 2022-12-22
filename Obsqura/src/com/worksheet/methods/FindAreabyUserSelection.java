package com.worksheet.methods;

import java.util.Scanner;

/*Write a program to find the Area of figures
a) Circle (pi*r*r)
b) Rectangle(l*b)
c) Square(a*a)
 Prompt the user to select the options(a/b/c) from command prompt.
 Get the inputs that needs to find area.*/

public class FindAreabyUserSelection {

	static void circleArea(int r) {
		float area = 3.14f * r * r;
		System.out.println("Area of circle is " + area);
	}

	static void rectangleArea(int l, int b) {

		int area = l * b;
		System.out.println("Area of Rectangle is " + area);

	}

	static void squareArea(int a) {
		int area = a * a;
		System.out.println("Area of square is " + area);
	}

	public static void main(String[] args) {
		System.out.println("Enter your selection : a-circle,b-rectangle, c-square");
		Scanner sc = new Scanner(System.in);
		char input = sc.nextLine().charAt(0);

		switch (input) {
		case 'a': {
			System.out.println("Enter the Radius of the circle");
			Scanner sc1 = new Scanner(System.in);
			int radius = sc1.nextInt();
			FindAreabyUserSelection.circleArea(radius);
			break;

		}
		case 'b': {
			System.out.println("Enter the length of the rectangle");
			Scanner sc2 = new Scanner(System.in);
			int length = sc2.nextInt();
			System.out.println("Enter the breadth of the rectangle");
			Scanner sc3 = new Scanner(System.in);
			int breadth = sc2.nextInt();
			FindAreabyUserSelection.rectangleArea(length, breadth);
			break;
		}

		case 'c': {
			System.out.println("Enter the side of the square");
			Scanner sc4 = new Scanner(System.in);
			int side = sc4.nextInt();
			FindAreabyUserSelection.squareArea(side);
			break;
		}
		}

	}
}
