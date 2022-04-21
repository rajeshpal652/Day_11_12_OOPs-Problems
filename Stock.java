package com.bl.day_11_12;
/*
 * @Author : Rajesh
 * Making the stock report taking input from user.
 */
import java.util.Scanner;

public class Stock {
	String stockName;
	int numberOfShare;
	double sharePrice, valueOfStock;
	
	Scanner sc = new Scanner(System.in);
	
	public double stockReport() {
		System.out.println("Name of the Stock");
		stockName = sc.next();
		System.out.println("Number of share");
		numberOfShare = sc.nextInt();
		System.out.println("Current price of the Share");
		sharePrice = sc.nextDouble();
		valueOfStock = numberOfShare * sharePrice;
		return valueOfStock;
	}
}
