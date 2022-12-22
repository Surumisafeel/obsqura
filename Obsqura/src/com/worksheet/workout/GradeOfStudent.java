package com.worksheet.workout;
/*Worksheet 10: Write a program to find the grade of a Student based on total marks
 Mark less than 40- Failed
 40 to 60–Grade D
 61 to 70-Grade C
 71 to 80-Grade B
 81 to 100-Grade A*/


import java.util.Scanner;
public class GradeOfStudent{
public static void main (String [] args){
System.out.println ("Enteryour mark");
Scanner sc = new Scanner(System.in);
int mark = sc.nextInt();

if((mark >=40) && (mark<=60)){
System.out.println ("Your grade is D");
}
else
if((mark >=61) && (mark<=70)){
System.out.println ("Your grade is C");
}
else
if ((mark >=71) && (mark<=80)){
System.out.println ("Your grade is B");
}
else
if ((mark >=81 )&&( mark<=100)){
System.out.println ("Your grade is A");
}
   else
System.out.println ("You are failed");
}
}
		