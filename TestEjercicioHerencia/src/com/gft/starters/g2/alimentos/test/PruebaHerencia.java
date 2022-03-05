package com.gft.starters.g2.alimentos.test;

import com.gft.starters.g2.alimentos.Alimento;
import com.gft.starters.g2.alimentos.Natural;

public class PruebaHerencia {

	public static void main(String[] args){
		Natural natural = new Natural(); 
		System.out.println("clase ["+natural.getClass().getName()+"]");
		
		Alimento alimento = new Natural();
		System.out.println("clase ["+alimento.getClass().getName()+"]");
		
	}
	
	
}
