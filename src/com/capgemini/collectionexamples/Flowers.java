package com.capgemini.collectionexamples;

public class Flowers {
	private int fId;
	private String fName;
	private double pricePerKg;
	private int quantity;
	
	public Flowers() {
		super();
	}

	public Flowers(int fId, String fName, double pricePerKg, int quantity) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.pricePerKg = pricePerKg;
		this.quantity = quantity;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
