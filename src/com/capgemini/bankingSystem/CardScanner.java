package com.capgemini.bankingSystem;

import java.util.Scanner;

public class CardScanner extends ATMCard {
	public boolean acceptCard(long cardId) {
		for(BankCustomer bc: details) {	
			if(bc.getCard().getCardId()==cardId) {
				return true;
				}
			}
			return false;
		
	}
	public void ReadCard(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin: ");
		int pin=sc.nextInt();
		for(BankCustomer bc: details) {	
			if(bc.getCard().getPIN()==pin) {
				bc.getCard().AcceptAmount(bc); 
				CashDispenser cd=new CashDispenser();
				System.out.println("Want to generate receipt? ");
				String str=sc.next();
				if(str.equalsIgnoreCase("yes")) {
					cd.generateReceipt(bc);
				}
				else {
					System.out.println("Cash not available!");
				}
				
				}
			}
	}
	public void ejectCard() {
		System.out.println("Remove your card");

	}
	void validatePin(){
	}

}
