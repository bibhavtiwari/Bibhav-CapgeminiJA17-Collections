package com.capgemini.bankingSystem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BankCustomer {
	@Override
	public String toString() {
		return "BankCustomer [CustomerName=" + customerName + ", Address=" + address + ", Email=" + email + ", Card="
				+ card + ", Acc=" + acc + "]";
	}
	public static Set<BankCustomer> details=new HashSet<BankCustomer>();
	Scanner sc=new Scanner(System.in);
	private String customerName;
	private String address;
	private String email;
	private ATMCard card;
	private Account acc;
	private Transaction trans;
	public BankCustomer() {
		super();
	}
	public BankCustomer(String customerName, String address, String email, ATMCard card, Account acc) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.card = card;
		this.acc = acc;
	}

	public void addCustomer(BankCustomer bc) {
		details.add(bc);
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ATMCard getCard() {
		return card;
	}
	public void setCard(ATMCard card) {
		this.card = card;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}

	public Transaction getTrans() {
		return trans;
	}
	public void setTrans(Transaction trans) {
		this.trans = trans;
	}
}
