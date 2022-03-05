package com.gft.starters.g2.poo;

import com.gft.starters.g2.poo.alimentos.Alimento;
import com.gft.starters.g2.poo.alimentos.Natural;

public class TestPruebaPolimorfismo {

	public static void main(String args[]){
		Natural alimento = new Natural("Test",'A');
		System.out.println(alimento.toString());
		System.out.println("Instancia de ["+alimento.getClass().getName()+"]");
		System.out.println(alimento.procesaAlimento());
		System.out.println(alimento.empaquetado());
		System.out.println(alimento.produccion());
	}
	
	
}
