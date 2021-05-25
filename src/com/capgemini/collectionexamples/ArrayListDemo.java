package com.capgemini.collectionexamples;
import java.security.AlgorithmConstraints;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Character> alphabets=new ArrayList<Character>();
		alphabets.add('A');
		alphabets.add('B');
		alphabets.add('C');
		alphabets.add('D');
		alphabets.add(null);
		alphabets.add('A');
		System.out.println(alphabets);
		
		//foreach method for arraylist
		for(Character al:alphabets) {
			System.out.println(al);
		}
		
		//for loop
		for(int i=0;i<alphabets.size();i++) {
			System.out.println(alphabets.get(i));
		}
		
		//using iterator
		Iterator<Character> chItr=alphabets.iterator();
		while(chItr.hasNext()) {
			System.out.println(chItr.next());
		}
		
		//list Iterator
		System.out.println("list in forward dirn");
		ListIterator<Character> chLitr=alphabets.listIterator();
		while(chLitr.hasNext()) {
			System.out.println(chLitr.next());
		}
		System.out.println("ArrayList in Backward dirn");
		while(chLitr.hasPrevious()) {
			System.out.println(chLitr.previous());
		}
		
		//remove
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the element to remove");
		Character ch=sc.next().trim().charAt(0);
		alphabets.remove(ch);
		
		System.out.println(alphabets);
		
		System.out.println("enter the index of element to remove");
		int i=sc.nextInt();
		alphabets.remove(i);
		
		System.out.println(alphabets);
		
		//convert arraylist in into array
		Object[] arr=alphabets.toArray();
		
		Character[] arr1=new Character[alphabets.size()];
		alphabets.toArray(arr1);
		System.out.println(arr1.length);
		System.out.println("printing");
		for(Character al: arr1) {
			System.out.println(al);
		}
		
		//sorting array
		//Arrays.sort(arr1);
		
		//converting array to arrayList
		ArrayList<Character>sortedAlphabets=new ArrayList<Character>(Arrays.asList(arr1));
		//printing
		System.out.println(sortedAlphabets);
		
		
		//adding arraylist to other arraylist
		ArrayList<Character> alphabets1=new ArrayList<Character>();
		alphabets1.add('A');
		alphabets1.add('B');
		alphabets1.add('C');
		alphabets1.add('D');
		alphabets1.add(null);
		alphabets1.add('A');
		
		alphabets.addAll(alphabets1);
		System.out.println("printing");
		System.out.println(alphabets);
		
		}

}
