package com.capgemini.collectionexamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer>  languages = new HashMap<String,Integer>();
		//add elements to the hashmap
		languages.put("Java", 17);
		languages.put("Java",8);
		//collision 
		languages.put("C", 11);
		languages.put("C++", 11);
		languages.put("JavaScript", 6);
		languages.put("Python", 3);
		
		System.out.println("HashMap Values = " + languages);
		
			//get() method for accessing value
			int value = languages.get("Java");
			System.out.println("Value in the HashMap with key 'Java'  = " + value);
			
			//set of keys from the above HashMap
		  Set<String> languagesKeySet = languages.keySet();
		  System.out.println("Key values of above HashMap = " + languagesKeySet);
		  
		  //set of values from the  above HashMap
		  Collection<Integer> languagesValueSet = languages.values();
		  System.out.println("Values of the above HashMap = " + languagesValueSet);
		  
		  //Key,Values from the above HashMap using entrySet() method
		  Set<Entry<String, Integer>> languagesKeyValueSet = languages.entrySet();
		  System.out.println("Key and Values from above HashMap = " + languagesKeyValueSet);
		  
		  
		  //replace a HashMap value
		  languages.replace("Java", 9);
		  
		  //Key,Values from the above HashMap using entrySet() method 
		  Set<Entry<String, Integer>> newLanguagesKeyValueSet = languages.entrySet();
		  System.out.println("Key and Values from above HashMap after replace = " + newLanguagesKeyValueSet);
		  
		  //replace a HashMap KeyValue
		  languages.replace("DataScience", 9);
		  
		  //Key,Values from the above HashMap using entrySet() method 
		  Set<Entry<String, Integer>> newLanguagesKeyValueSet1 = languages.entrySet();
		  System.out.println("Key and Values from above HashMap after replace of key= " + newLanguagesKeyValueSet1 );
		  
		  //Iterate through a HashMap
		  //iterating through the keyset using keyset() method
		  System.out.println("Keys = ");
		 for(String key : languages.keySet()) {
			 System.out.print(key);
			 System.out.print(", ");
			 System.out.println();
		 }
		  System.out.println("Keys using Set= ");
		 for(String key :languagesKeySet) {
			 System.out.print(key);
			 System.out.print(", ");
		 }

		 
		 
		  //Iterate through a HashMap
		  //iterating through the Values using values() method
		  System.out.println("Values = ");
		 for(Integer values : languages.values()) {
			 System.out.print(values);
			 System.out.print(", ");
			 System.out.println();
		 }
		 
		 
		  System.out.println("Values using Set= ");
		 for(Integer values :languagesValueSet) {
			 System.out.print(values);
			 System.out.print(", ");
		 }
	
	
	
	  //Iterate through a HashMap
	  //iterating through the Key,Values using entrySet() method
	  System.out.println("Key,Values using EntrySet=");
	 for(Entry<String, Integer> hashmapdata : languages.entrySet()) {
		 System.out.print(hashmapdata);
		 System.out.print(", ");
		 System.out.println();
	 }
	  System.out.println("Key,Values using EntrySet= ");
	 for(Entry<String, Integer> hashmapdata :languagesKeyValueSet) {
		 System.out.print(hashmapdata);
		 System.out.print(", ");
		 
	 }
	 
	 //converting HashMap to TreeMap to sort the values
		Map<String,Integer>  languagesSorted = new TreeMap<String,Integer>();
		languagesSorted.putAll(languages);
		System.out.println();
		System.out.println("sorted data  = " + languagesSorted);
		
}
	}

