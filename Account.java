package com.bl.day_11_12;
/*
 * @Author : Rajesh
 * Debiting money from total value of account balance according to user's need.
 */
import java.util.Scanner;

public class Account {
	static double accountBalance;
	double debitAmount;
	StockPortfolio stockPortfolio = new StockPortfolio();
	Scanner sc = new Scanner(System.in);
	
	public void debit() {
		accountBalance = stockPortfolio.totalStockReport();
		System.out.println("Enter the amount you want to withdraw : ");
		debitAmount = sc.nextDouble();
		
		if(debitAmount <= accountBalance) {
			accountBalance -= debitAmount;
		}else
			System.out.println("Debit amount exceeded account balance.");
		System.out.println("Remaining Balance : "+accountBalance);
	}
	public static void main(String[] args) {
		Account account = new Account();
		account.debit();
	}
}
