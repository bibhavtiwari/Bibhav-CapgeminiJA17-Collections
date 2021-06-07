package com.capgemini.bankingSystem;

import java.util.Scanner;

public class ATM {
	@Override
	public String toString() {
		return "ATM [Location=" + location + ", BranchName=" + branchName + "]";
	}
	Scanner sc=new Scanner(System.in);
	private String location;
	private String branchName;
	public ATM() {
		super();
	}
	public ATM(String location, String branchName) {
		super();
		this.location = location;
		this.branchName = branchName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

}
