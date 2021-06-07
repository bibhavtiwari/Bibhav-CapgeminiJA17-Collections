package com.capgemini.bankingSystem;

import java.util.Scanner;

import javax.naming.InvalidNameException;

public class BankCustomerImpl extends BankCustomer{
	BankCustomer ob=new BankCustomer();
	String name,add,email;
	Double bal;
	Account ac;
	public void create() {
		Scanner sc=new Scanner(System.in);
		try {
		BankCustomer ob=new BankCustomer();
		String name,add,email;
		Double bal;
		Account ac;
		System.out.println("Enter the details: ");
		System.out.println("Enter the name: ");
		name=sc.nextLine();
		if(!(name.matches("^[a-zA-Z\\s]*$"))) {
			throw new InvalidNameException("Only characters allowed! ");
		}
		System.out.println("Enter the address: ");
		sc.nextLine();
		add=sc.nextLine();
		System.out.println("Enter the email: ");
		email=sc.next();
		if(!(email.matches("^[a-zA-Z0-9._+]{3,}[a-zA-Z0-9]{0,}@[a-z]{2,}\\.(.+)$"))) {
			throw new InvalidEmailException("Invalid email!");
		}
		System.out.println("Enter 1 to create SavingsAccount,2 to create CurrentAccount :");
		int c=sc.nextInt();
		if(c==1) {
//			ob.setCustomerName(name);
//			ob.setAddress(add);
//			ob.setEmail(email);
			System.out.println("Enter the starting balance: ");
			bal=sc.nextDouble();
			ac=new SavingsAccount(bal);
			System.out.println("Enter the Card details: ");
			System.out.println("====================================");
			System.out.println("Enter the pin: ");
			int pin=sc.nextInt();
			ATMCard cd=new ATMCard(pin,ac);
			ob=new BankCustomer(name,add,email,cd,ac);
			ob.addCustomer(ob);
		}
		if(c==2) {
//			ob.setCustomerName(name);
//			ob.setAddress(add);
//			ob.setEmail(email);
			System.out.println("Enter the starting balance: ");
			bal=sc.nextDouble();
			ac=new SavingsAccount(bal);
			System.out.println("Enter the Card details: ");
			System.out.println("====================================");
			System.out.println("Enter the pin: ");
			int pin=sc.nextInt();
			ATMCard cd=new ATMCard(pin,ac);
			ob=new BankCustomer(name,add,email,cd,ac);
			ob.addCustomer(ob);
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter accountNo: ");
		int accNo=sc.nextInt();
		boolean flag=false;
		for(BankCustomer i: details) {
			if(i.getAcc().getAccountNumber()==accNo) {
				flag=true;
				while(flag) {
					System.out.println("Enter your choice to update the details: ");
					System.out.println("========================================");
					System.out.println("Enter 1 for name:");
					System.out.println("Enter 2 for address:");
					System.out.println("Enter 3 for email: ");
					System.out.println("Enter 0 to exit: ");
					System.out.println("Enter");
					try {
					int ch=sc.nextInt();
					if(ch==1) {
						System.out.println("Enter name: ");
						name=sc.next();
						if(!(name.matches("^[a-zA-Z\\s]*$"))) {
							throw new InvalidNameException("Only characters allowed! ");
						}
						i.setCustomerName(name);
					}
					else if(ch==2) {
						System.out.println("Enter address: ");
						sc.nextLine();
						add=sc.nextLine();
						i.setAddress(add);
					}
					else if(ch==3) {
						System.out.println("Enter email: ");
						email=sc.next();
						if(!(email.matches("^[a-zA-Z0-9._+]{3,}[a-zA-Z0-9]{0,}@[a-z]{2,}\\.(.+)$"))) {
							throw new InvalidEmailException("Invalid email!");
						}
						i.setEmail(email);
					}
					else if(ch==0) {
						break;
					}
					else {
						System.out.println("Invalid Choice!");
					}
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
				}
			}
		}
		if(flag==false) {
			System.out.println("No such Account found!");
		}

	}
	public void display() {
		for(BankCustomer i: details) {
			System.out.println(i);
		}
	}
}
