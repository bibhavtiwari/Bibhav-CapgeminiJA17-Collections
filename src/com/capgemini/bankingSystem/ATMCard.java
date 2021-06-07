package com.capgemini.bankingSystem;

import java.util.Scanner;

public class ATMCard extends BankCustomer {
	@Override
	public String toString() {
		return "ATMCard [pin=" + pin + ", cardId=" + cardId + "]";
	}
	private int pin;
	private static long cId=1234l;
	private long cardId;
	private Account Acc;
	Scanner sc=new Scanner(System.in);
	public ATMCard(int pin,Account acc) {
		super();
		this.pin = pin;
		this.cardId = cId;
		Acc = acc;
		cId++;
	}
	public long getCardId() {
		return cardId;
	}
	public void setCardId() {
		this.cardId = cId;
		cId++;
	}
	public ATMCard() {
		super();
	}
	public int getPIN() {
		return pin;
	}
	public void setPIN(int Pin) {
		this.pin = Pin;
	}
	public Account getAcc() {
		return Acc;
	}
	public void setAcc(Account acc) {
		Acc = acc;
	}
	public void AcceptAmount(BankCustomer bc) {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to withdraw: ");
		double amt=sc.nextDouble();
		CashDispenser cd=new CashDispenser();
		if(cd.SupplyCash()>amt) {
		bc.getAcc().VerifyWithDrawAmount(bc,amt);
		cd.setAvailableCash(amt);
		}
		else {
			System.out.println("Cash not available!");
		}
		
	}
}
