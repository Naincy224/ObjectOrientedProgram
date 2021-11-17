package com.bridgeit.stockmanagement;

import java.io.IOException;

public class StockMain {
	
	public static void main(String[] args) {
		
		StockPortfolio portfolio = new StockPortfolio();
		try {
			portfolio.getStockDetail();
			portfolio.generateReport();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
