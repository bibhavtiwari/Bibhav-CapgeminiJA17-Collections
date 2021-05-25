package com.capgemini.collectionexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FlowersMain {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 HashSet<Flowers> flwList = new HashSet<Flowers>();
 		Flowers  flw;
		   while(true) {
		    System.out.println("1. Create");
			System.out.println("2. Display");
			System.out.println("3. Remove");
			System.out.print("Enter your choice : ");
		   int choice = sc.nextInt(); 
			switch(choice) {
		     case 1:
		    	
		    			for(int i=0;i<3;i++) {
		    				System.out.println("Enter the Flowers details");
		    				System.out.println("Enter the Flower id");
		    				int id = sc.nextInt();
		    				System.out.println("Enter the Flower Name");
		    				String name = sc.next();
		    				System.out.println("Enter the Flower price per kg");
		    				double ppk = sc.nextInt();
		    				System.out.println("Enter the Flower quantity");
		    				int qan = sc.nextInt();
		    				
		    				flwList.add(new Flowers(id,name,ppk,qan));
		    			}
		       break;
		     case 2:
		    	 Iterator<Flowers> flwItr = flwList.iterator();
		 		System.out.println("Flowers List");
		 		System.out.println("Name"+"\t"+"FlwId"+"\t"+"Price/kg"+"\t"+"Quantity");
		
		 		while(flwItr.hasNext()) {
		 			Flowers fw = flwItr.next();
		 			System.out.println(fw.getfName() +"\t"+ fw.getfId()+"\t"+fw.getPricePerKg()+"\t"+fw.getQuantity());
		 			System.out.println();
		 		}
		       break;
		     case 3:
		    	 Iterator<Flowers> flwItr1 = flwList.iterator();
		    		System.out.println("Enter the quantity of the flowers below which you want to remove");
		    		int idi =sc.nextInt();
		    		while(flwItr1.hasNext()) {
		    			Flowers fw=flwItr1.next();
		    			if(fw.getQuantity()<idi) {
		    				flwItr1.remove();
		    			}	
		    		}
		       break;
		     default: System.out.println("Enter correct choice (1-3)...");
		       break;
		   }System.out.print("Do you want to continue?(y/n) ");
			sc.nextLine();
			char c=sc.next().charAt(0);
			if(c=='n' || c=='N') {
				break;
			}

	
		
}}
}