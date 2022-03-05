package com.gft.starters.g2.poo.patterns;

import java.util.Date;

public class TestCloneable {

	public static void main(String args[]){
		
		Hospital hospital = new Hospital("hospital1","direccion1", new Date());
		System.out.println( hospital.toString());
		Hospital hospital2 =  (Hospital)hospital.clone();
		System.out.println(hospital2.toString());		
	}
	
	
}

