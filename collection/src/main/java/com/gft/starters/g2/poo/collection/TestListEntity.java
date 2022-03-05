package com.gft.starters.g2.poo.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.gft.starters.g2.poo.collection.entity.Persona;

public class TestListEntity {

	public static void main(String args[]){
		List set = new ArrayList();
		
		Persona personaEd = new Persona("Ed",30,"M");
		Persona personaDan = new Persona("Daniel",21,"M");
		Persona personaGabo = new Persona("Gabriel",22,"M");
		Persona personaOr = new Persona("Orlando",15,"M");
		Persona personaLeo = new Persona("Leonardo",24,"M");
		Persona personaJorge = new Persona("Jorge",25,"M");
		Persona personaX = new Persona("Jorge",25,"M");
		
		set.add(personaEd);
		set.add(personaDan);
		set.add(personaGabo);
		set.add(personaOr);
		set.add(personaLeo);
		set.add(personaJorge);
		set.add(personaX);
		
		Collections.sort(set);
		System.out.println("imprimiendo el ser["+set+"]");		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println("Persona "+((Persona)iterator.next()).toString());
		}
		
		
		
	}
	
	
}
