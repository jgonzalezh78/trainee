package com.gft.starters.g2.poo.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String args[]){
		
		Queue queue = new LinkedList<>();
		queue.add("A");
		queue.add("B");
		queue.add("C");
		queue.add("D");
		
		System.out.println("imprimiendo la queue["+queue+"]");		
		Object o = queue.poll();
		System.out.println("["+o+"]");
		System.out.println("imprimiendo la queue["+queue+"]");
		
		
		
	}
	
	
}
