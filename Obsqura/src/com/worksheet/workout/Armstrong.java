package com.worksheet.workout;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
    	System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

        int originalNumber=0, remainder=0, result = 0, n = 0;

        originalNumber = number;
        while (originalNumber != 0){
        	originalNumber /= 10;
        
        
        originalNumber = number;
        ++n;
        
        }

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}