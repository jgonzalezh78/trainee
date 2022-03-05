package com.gft.starters.g2.poo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String args[]){
		
		List list = new ArrayList();
		list.add("D");
		list.add("A");
		list.add("B");
		list.add("C");		
		list.add("A");
		
		for(int i=0;list!= null && list.size()>0 && i<list.size();i++){
			System.out.println("Elemento posicion["+i+"]valor["+list.get(i)+"]");
		}
		System.out.println("\n");
		for(Object i: list!=null?list:new ArrayList() ){
			System.out.println("Elemento posicion["+list.indexOf(i)+"]valor["+i+"]");
		}
		System.out.println("\n");	
		
		Collections.sort(list);
		
		Iterator iterator = list!=null?list.iterator():null;
		while(iterator != null && iterator.hasNext()){
			System.out.println("Elemento posicion[]valor["+iterator.next()+"]");
		}
		
		
	}
	
	
	
}
