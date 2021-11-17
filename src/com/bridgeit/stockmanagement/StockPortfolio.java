package com.bridgeit.stockmanagement;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class StockPortfolio {
	
	private List<Stock> stockList = null;
	

	public List<Stock> getStockList() {
		return stockList;
	}

	public void setStockList(List<Stock> stockList) {
		this.stockList = stockList;
	}
	
	
	public void getStockDetail() throws IOException {
		
		List<String> stockInfos = new ArrayList<String>();
		Path path = Paths.get("/ObjectOrientedProgrames/src/com/bridgeit/stockmanagement/stockInfo.txt");
		stockInfos = Files.readAllLines(path);
		System.out.println(stockInfos);
		
		for(String info :stockInfos) {
			String[] eachinfo = info.split(" ");
			String stockName = eachinfo[0];
			int numberOfShare = Integer.valueOf(eachinfo[1]);
			int sharePrice = Integer.valueOf(eachinfo[2]);
			int shareValue = numberOfShare * sharePrice;
		
		Stock stock = new Stock(stockName, numberOfShare, sharePrice, shareValue);
		this.stockList.add(stock);
		
		}
	
	}
	
	public void generateReport() throws IOException {
		BufferedWriter writer = new BufferedWriter(new FileWriter(new File("/ObjectOrientedProgrames/src/com/bridgeit/stockmanagement/stockInfoReport.txt")));
		for(Stock stock:stockList) {
			writer.write(stock+System.lineSeparator());
		}
		writer.close();
	}
	

}
