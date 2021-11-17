package com.bridgeit.stockmanagement;

public class Stock {
	
	private String stockName;
	private int numberOfShare;
	private int sharePrice;
	private int stockValue;
	
	public Stock(String stockName, int numberOfShare, int sharePrice, int stockValue) {
		super();
		this.stockName = stockName;
		this.numberOfShare = numberOfShare;
		this.sharePrice = sharePrice;
		this.stockValue = stockValue;
	}
	
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNumberOfShare() {
		return numberOfShare;
	}
	public void setNumberOfShare(int numberOfShare) {
		this.numberOfShare = numberOfShare;
	}
	public int getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getStockValue() {
		return stockValue;
	}
	public void setStockValue(int stockValue) {
		this.stockValue = stockValue;
	}
	
	
	

}
