package com.gft.starters.g2.service;

public class Test {

	public static void main(String args[]){
		
		CalculadoraService service = new CalculadoraService();
		Calculadora calculadora = service.getCalculadora();
		
		System.out.println(calculadora.suma(1, 2));
		
	}
	
	
}
