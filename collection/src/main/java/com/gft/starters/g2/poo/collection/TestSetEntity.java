package com.gft.starters.g2.poo.collection;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import com.gft.starters.g2.poo.collection.entity.Persona;

public class TestSetEntity {

	public static void main(String args[]){
		SortedSet set = new TreeSet();
		
		Persona personaEd = new Persona("Ed",20,"M");
		Persona personaDan = new Persona("Daniel",21,"M");
		Persona personaGabo = new Persona("Gabriel",22,"M");
		Persona personaOr = new Persona("Orlando",23,"M");
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
		
		System.out.println("imprimiendo el ser["+set+"]");		
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println("Persona "+((Persona)iterator.next()).toString());
		}
		
		
		
	}
	
	
}
