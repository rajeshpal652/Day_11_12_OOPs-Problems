package com.bl.day_11_12;

import java.util.Scanner;
/*
 * @Author : Rajesh
 * Calculating the total stock value based on the input from user.
 */
public class StockPortfolio {
	static double totalValueOfStocks = 0.0;
	int numberOfStocks;
	
	Scanner sc = new Scanner(System.in);
	Stock stock = new Stock();
	
	public double totalStockReport() {
		System.out.println("Enter how many different stocks you want to have in your portfolio");
		numberOfStocks = sc.nextInt();
		
		for(int i = 1; i <= numberOfStocks; i++) {
			totalValueOfStocks += stock.stockReport();
		}
		System.out.println("Total value of all the stocks : "+totalValueOfStocks);
		return totalValueOfStocks; 
	}
}
