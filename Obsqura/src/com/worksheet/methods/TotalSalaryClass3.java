package com.worksheet.methods;

import java.util.Scanner;

/*Program to find the total salary by hand of an Employee
 Class 1
Get basic pay, deduction and bonus from console.
 Class 2
Calculate hra (5% of basic pay) and pf (20% of basic pay).
 Class 3
Find the total salary (basicpay+hra-pf-deduction+bonus) and get the salary slip
Salary slip should contains :- basic pay, deduction, hra, pf, bonus and total salary by
hand.*/

 class TotalSalaryClass3 {
	 double totalSalary;
	
	public static void main(String[] args) {
		
		TotalSalaryClass1 obj =new TotalSalaryClass1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic pay");
		obj.basicPay = sc.nextInt();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter deduction pay");
		obj.deduction = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter bonus pay");
		obj.bonus = sc2.nextInt();
		
		TotalSalaryClass2 obj1 = new TotalSalaryClass2();
		double hra = obj1.CalcHRA(obj.basicPay);
		double pf = obj1.pf(obj.basicPay);
		TotalSalaryClass3 obj3= new TotalSalaryClass3();
		
		obj3.totalSalary =obj.basicPay+hra-pf-obj.deduction+obj.bonus;
		
		System.out.println("Salary slip of Employe");
		System.out.println("Total Salary " +obj3.totalSalary);
		System.out.println("Basic pay:" +obj.basicPay);
		System.out.println("Deduction"+ obj.deduction);
		System.out.println("HRA:" +hra);
		System.out.println("PF:"+ pf);
		
		
	}

}
