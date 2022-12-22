//Example 20. Write a program to search array element with Linear Search.

package com.worksheet.workout;

import java.util.Scanner;

public class LinearSearchArray {
	public static void main(String[] args) {
		System.out.println("Enter number to searched");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int flag = 0;
		int[] array = { 2, 3, 4, 5, 6, 7, 10, 8, 9 };
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				System.out.println(i + "th element is the number");
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("Number not present in this array");

	}
}
