package com.capgemini.bankingSystem;

public abstract class Account {

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + "]";
	}
	static int count=100;
	private int accountNumber;
	private double balance;
	private Transaction Trans;
	abstract void CalculateInterest(BankCustomer bc);
	public abstract void UpdateAccount();
	public void VerifyWithDrawAmount(BankCustomer bc,double amt) {
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public Account() {
		super();
	}
	public void setAccountNumber() {
		this.accountNumber = count;
		count++;
	}
	public Account(double balance) {
		super();
		this.accountNumber = count;
		this.balance = balance;
		count++;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}


	public Transaction getTrans() {
		return Trans;
	}
	public void setTrans(Transaction trans) {
		Trans = trans;
	}
}
