package com.worksheet.methods;
/*Program to find the total salary by hand of an Employee
 Class 1
Get basic pay, deduction and bonus from console.
 Class 2
Calculate hra (5% of basic pay) and pf (20% of basic pay).
 Class 3
Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip
Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by
hand.*/

public class TotalSalaryClass2 {
public double CalcHRA(int basicPay){
return (basicPay*.05);
}

public double pf(int basicPay){
	return (basicPay*.2);
}
}
