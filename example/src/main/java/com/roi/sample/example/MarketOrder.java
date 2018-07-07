package com.roi.sample.example;

public class MarketOrder {
	private String currency;
	private int amount;
	private String side;
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getSide() {
		return side;
	}
	public void setSide(String side) {
		this.side = side;
	}
	
	
	
	public String toString() {
		return currency + " : "+amount + " : " + side;
	}

}
