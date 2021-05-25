package com.capgemini.ems;

import java.util.Scanner;

public class Product {
	private int pId;
	private String pName;
	private int price;
	public Product() {
		super();
	}
	public Product(int pId, String pName, int price) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.price = price;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	Scanner sc = new Scanner(System.in);
	//Display All
	public void displayProductDetails(Product[] pro) {
		// TODO Auto-generated method stub
		for (int i=0;i<pro.length;i++) {
		System.out.println("product Id = " + pro[i].getpId() + "Product name = " + pro[i].getpName()+"Product Price"+pro[i].getPrice());
		System.out.println();
		}
		}
	
	//display using product id
		public void FindProductById(Product[] pro,int pId) {
			for(int i=0;i<pro.length;i++) {
				if(pro[i].getpId() == pId)
				{
					System.out.println("product found at " + i);
					System.out.println("product Id = " + pro[i].getpId() + "Product name = " + pro[i].getpName()+"Product Price"+pro[i].getPrice());
					break;
				}else {
					System.out.println("No product found");
				}
			}
			System.out.println();
		}
		//update product using id
		public void updateProductById(Product[] pro,int pId) {
			for(int i=0;i<pro.length;i++) {
				if(pro[i].getpId() == pId)
				{
					
					System.out.println("Enter new name to update for the Product");
					String updatedname=sc.next();
					pro[i].setpName(updatedname);
					System.out.println("product Id = " + pro[i].getpId() + "Product name = " + pro[i].getpName()+"Product Price"+pro[i].getPrice() );
					break;
				}else {
					System.out.println("No Product found at given ID");
				}
			}
			System.out.println();
		}
		//delete an product by id
				public Product[] deleteProductById(Product[] pro,int pId) {
					int originalLength = pro.length;
					for(int i=0;i<originalLength;i++) {
						if(pro[i].getpId() == pId)
						{
							System.out.println("Product found at " + i);
							pro[i] = pro[originalLength+1];
							originalLength--;
							break;
						}else {
							System.out.println("No Product found at given ID");
						}
					}
					System.out.println();
					return pro;
				}
				//creating the list of employees using array and returning an array
				   Product[] proList1 = new Product[3];
				public Product[] createProList() {
					   for(int i=0;i<proList1.length;i++) {
						   System.out.println("Enter the Product details for  "+ i + " product object");
						   proList1[i] = new Product();
						   proList1[i].setpId(sc.nextInt());
						   proList1[i].setpName(sc.next());
						   proList1[i].setPrice(sc.nextInt());
					   }
					   return proList1;
		
}
}
