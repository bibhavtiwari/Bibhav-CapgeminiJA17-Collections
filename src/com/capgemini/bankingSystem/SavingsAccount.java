package com.capgemini.bankingSystem;
import java.util.Scanner;
public class SavingsAccount extends Account {
	Scanner sc=new Scanner(System.in);
	private final float intInterestRate=0.4f;
	private double amount;
	
	public SavingsAccount() {
		super();
	}
	public SavingsAccount(double balance) {
		super(balance);
	}
	@Override
	void CalculateInterest(BankCustomer bc) {
		// TODO Auto-generated method stub
		this.amount=bc.getAcc().getBalance()*this.intInterestRate;
	}
	@Override
	public void UpdateAccount() {
		// TODO Auto-generated method stub

	}
	@Override
	public void VerifyWithDrawAmount(BankCustomer bc,double amt) {
		// TODO Auto-generated method stub
		if(amt<bc.getAcc().getBalance()) {
			bc.getAcc().setBalance(bc.getAcc().getBalance()-amt);
		}
		else {
			System.out.println("Amount exceeded!");
		}
		
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(BankCustomer bc) {
		bc.getAcc().setBalance(bc.getAcc().getBalance()+this.amount);
	}
}
