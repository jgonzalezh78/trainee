package com.gft.staters.g2.rest.business;

import org.springframework.stereotype.Component;

@Component
public class CalculadoraBasica {

	public Double suma(Double operador1,Double operador2) {
		Double resultado = null;
		if(operador1 != null && operador2 != null ){
			resultado = operador1+operador2;
		}
		return resultado;
	}

	public Double resta(Double operador1,Double operador2) {
		Double resultado = null;
		if(operador1 != null && operador2 != null ){
			resultado = operador1-operador2;
		}
		return resultado;
	}
	
	public Double multiplicacion(Double operador1,Double operador2) {
		Double resultado = null;
		if(operador1 != null && operador2 != null ){
			resultado = operador1*operador2;
		}
		return resultado;
	}
	
	public Double division(Double operador1,Double operador2) {
		Double resultado = null;
		if(operador1 != null && operador2 != null ){
			resultado = operador1/operador2;
		}
		return resultado;
	}


	

	
	
}
