package com.worksheet.methods;
/*Write a program to find the factorial of a number(static method)
 Output – “Factorial of <given number> is <result>.
*/

public class FactorialMethod {
	
	static int FactOfNumber(){
		 int fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(int i=1;i<=number;i++){    
		      fact=fact*i; 
		  }
		
		return fact;
	}
public static void main(String[] args) {
	
	int Result=FactorialMethod.FactOfNumber();
}
}
