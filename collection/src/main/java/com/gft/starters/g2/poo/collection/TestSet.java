package com.gft.starters.g2.poo.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {

	public static void main(String args[]){
		
		Set set = new HashSet();
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");		
		set.add("A");
		
		
		System.out.println("\n");		
		Iterator iterator = set!=null?set.iterator():null;
		while(iterator != null && iterator.hasNext()){
			System.out.println("Elemento posicion[]valor["+iterator.next()+"]");
		}
		
		
	}
	
	
	
}
