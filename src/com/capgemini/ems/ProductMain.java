package com.capgemini.ems;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		 Product pro = new Product();
		   Product[] proList1 = new Product[3];
		   Scanner sc = new Scanner(System.in);
		   while(true) {
		    System.out.println("1. Create");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Display All");
			System.out.println("5. Display By Id");
			System.out.print("Enter your choice : ");
		   int choice = sc.nextInt(); 
			switch(choice) {
		     case 1:
		       System.out.println("Enter the proid to create a Product");
		      
			   proList1 =  pro.createProList();
		       break;
		     case 2:
		      System.out.println("Enter the proid to update a Product details");
		   	  int pid = sc.nextInt();
		   	  pro.updateProductById(proList1, pid);
		       break;
		     case 3:
		    	 System.out.println("Enter the proid to delete a Product details");
		   	  int did = sc.nextInt();
		   	  pro.deleteProductById(proList1, did);
		       break;
		     case 4:
		      System.out.println("Out put from displayProductDetails with Product[] object as argument ");
		   	  pro.displayProductDetails(proList1);
		       break;
		     case 5:
		    	 System.out.println("Enter the proid to find a Product");
		   	  int id = sc.nextInt();
		   	  pro.FindProductById(proList1, id);
		       break;
		     default: System.out.println("Enter correct choice (1-3)...");
		       break;
		   }System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			char c=sc.next().charAt(0);
			if(c=='n' || c=='N') {
				break;
			}
	}
}
}
