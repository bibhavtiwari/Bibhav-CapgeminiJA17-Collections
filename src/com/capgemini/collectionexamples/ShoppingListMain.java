package com.capgemini.collectionexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ShoppingListMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>  ShoppingList = new HashMap<String,Integer>();
		ShoppingList.put("Rice",12);
		ShoppingList.put("Beans",62);
		ShoppingList.put("Ketchup",17);
		ShoppingList.put("Soya",54);
		ShoppingList.put("Oil",96);
		ShoppingList.put("Soap",123);
		
		//Get a set of the entries
		Set<Map.Entry<String,Integer>> SL = ShoppingList.entrySet();
		System.out.println("Entry Set "+ SL);
		//Key Set
		  Set<String> languagesKeySet = ShoppingList.keySet();
		  System.out.println("Key values of above HashMap = " + languagesKeySet);
		  //Value Set
		  Collection<Integer> languagesValueSet = ShoppingList.values();
		  System.out.println("Values of the above HashMap = " + languagesValueSet);
		

}}
