package com.gft.starters.g2.poo.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TestMap {

	public static void main(String args[]){
		
		Map map = new TreeMap();
		map.put(1, "E");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "A");
		
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
