package com.capgemini.bankingSystem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Transaction extends BankCustomer {
	@Override
	public String toString() {
		return "Transaction [str=" + str + ", amount=" + amount + ", deposit=" + deposit + "]";
	}
	String str;
	double amount;
	double deposit;
	public void StartTransaction(){
		System.out.println("Transaction started!");
	}
	public void CancelTransaction() {
		System.out.println("Transaction ended!");
	}
	public String getDate() {
		return str;
	}
	public void setDate() {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		this.str=sdf.format(d);
	}
	public void setAmount(int accNo) {
		boolean flag=false;
		for(BankCustomer c:details) {
			if(c.getAcc().getAccountNumber()==accNo) {
				flag=true;
		this.amount=c.getAcc().getBalance()+getDeposit();
		System.out.println("Enter 1 if savings account/2 for current account: ");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		if(s==1) {
		Account acc=new SavingsAccount(amount);
		c.setAcc(acc);
		}
		else if(s==2) {
			Account acc=new CurrentAccount(amount);
			c.setAcc(acc);	
		}
		else {
			System.out.println("Invalid choice!");
		}
		}
		}
		if(flag==false) {
			System.out.println("Account No does not exist!");
		}
	}
	public double getAmount() {
		return amount;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
}
