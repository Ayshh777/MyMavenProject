package com.portfolio.app.model;

public class Stock
{
    private String stockid;
    private String stockname;
    private double price;
    
	public Stock(String stockid, String name, double price) {
		
	}

	public String getStockid() {
		return stockid;
	}

	public void setStockid(String stockid) {
		this.stockid = stockid;
	}

	public String getStockname() {
		return stockname;
	}

	public void setStockname(String stockname) {
		this.stockname = stockname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Stock ID:" + stockid);
		System.out.println("Stock Name:" + stockname);
		System.out.println("Purchase Price:" + price);
	}
		
	}

	
		
	


