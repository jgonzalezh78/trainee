package com.gft.starters.g2.poo.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {

	public static void main(String args[]){
		
		Map map = new HashMap();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "A");
		map.put(5, "Z");
		
		for(int i=map.size(); map!= null && map.size()>=1 && i>=1;i--){
			System.out.println("Elemento posicion["+i+"]valor["+map.get(i)+"]");
		}
		System.out.println("\n");
		
		Set iterator = map!=null?map.keySet():null;
		for(Object object : iterator){
			System.out.println("Elemento posicion[]valor["+map.get(object)+"]");
		}
	}
	
	
}
