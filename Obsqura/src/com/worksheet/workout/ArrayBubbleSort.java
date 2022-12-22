//21. Write a program to sort array element with Bubble Sort.

package com.worksheet.workout;

public class ArrayBubbleSort {
	public static void main(String[] args) {
		
		int[] numbers = { 2, 6, 4, 5 };
		int temp = 0;
		int length = numbers.length;
		for (int i = 0; i < length; i++) {
			for (int j = i+1; j < length; j++) {
				if (numbers[i] > numbers[j]){
					temp = numbers[i];
				numbers[i] = numbers[j];
				numbers[j] = temp;
				}
			}
		}

		System.out.println("Array Before Bubble Sort");
		for (int number:numbers) {
			System.out.print(number );

		}
	}
}