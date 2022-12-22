package com.worksheet.methods;

import java.util.Scanner;

/*Write a program to deposit and withdraw amount from bank account(Withdrawal amount do not 
exceeds the current balance). Add an extra method to check the account balance. (static 
methods)*/

public class BankOperation {
	static int saving;

	static boolean BalanceCheck(int withdrawamount) {
		if (withdrawamount > saving)
			return false;
		else
			return true;
	}

	static void Deposit(int amount) {
		saving = saving + amount;
		System.out.println("Amount is deposited " + amount);
	}

	static void Withdraw(int withdrawamount) {
		boolean flag = BalanceCheck(withdrawamount);
		if (flag == true) {
			saving = saving - withdrawamount;
			System.out.println("Amount is withdrawn  " + withdrawamount);
			System.out.println("Available balance is  " + saving);
		} else{
			System.out.println("Amount cannot be withdrawn");
		System.out.println("Available Balance is " + saving);
		}
	}

	public static void main(String[] args) {
		System.out.println("Deposit amount");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		BankOperation.Deposit(amount);
		System.out.println("Withdraw amount");
		Scanner sc1 = new Scanner(System.in);
		int withdrawamount = sc.nextInt();
		BankOperation.Withdraw(withdrawamount);
	}

}
