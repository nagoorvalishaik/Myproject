package com.capg.spring;

public class Stocks {
	
	private int stockId;
	private String stockName;
	private int bookValue;
	private int currentPrice;
	private int  high52;
	private int low52;
	
	
	/**
	 * @param stockId
	 * @param stockName
	 * @param bookValue
	 * @param currentPrice
	 * @param high52
	 * @param low52
	 */
	public Stocks(int stockId, String stockName, int bookValue, int currentPrice, int high52, int low52) {
		this.stockId = stockId;
		this.stockName = stockName;
		this.bookValue = bookValue;
		this.currentPrice = currentPrice;
		this.high52 = high52;
		this.low52 = low52;
	}
	
	
	
	
	/**
	 * 
	 */
	public Stocks() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getBookValue() {
		return bookValue;
	}
	public void setBookValue(int bookValue) {
		this.bookValue = bookValue;
	}
	public int getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
	}
	public int getHigh52() {
		return high52;
	}
	public void setHigh52(int high52) {
		this.high52 = high52;
	}
	public int getLow52() {
		return low52;
	}
	public void setLow52(int low52) {
		this.low52 = low52;
	}




	@Override
	public String toString() {
		return "Stocks [stockId=" + stockId + ", stockName=" + stockName + ", bookValue=" + bookValue
				+ ", currentPrice=" + currentPrice + ", high52=" + high52 + ", low52=" + low52 + "]";
	}
	
	
	
	
}
