package com.gft.staters.g2.rest.business;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraCientifica extends CalculadoraBasica{

	public Double raizCuadra(Double operador1){
		Double resultado = null;
		if(operador1 != null ){
			resultado = Math.sqrt(operador1);
		}
		return resultado;
	}
	
	public Double potencia(Double operador1,Double operador2){
		Double resultado = null;
		if(operador1 != null ){
			resultado = Math.pow(operador1,operador2);
		}
		return resultado;
	}
	
	
}
