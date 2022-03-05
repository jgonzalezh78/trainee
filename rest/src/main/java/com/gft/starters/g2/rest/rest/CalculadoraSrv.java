package com.gft.starters.g2.rest.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gft.starters.g2.rest.rest.dto.DTOOperacion;
import com.gft.starters.g2.rest.rest.dto.DTORespuesta;
import com.gft.staters.g2.rest.business.CalculadoraBasica;
import com.gft.staters.g2.rest.business.CalculadoraCientifica;


@RestController
public class CalculadoraSrv implements ICalculadora{

	@Autowired
	private CalculadoraBasica calculadoraBasica;
	

	@Autowired
	private CalculadoraCientifica calculadoraCientifica;
	
	
	
	public CalculadoraBasica getCalculadoraBasica() {
		return calculadoraBasica;
	}


	public void setCalculadoraBasica(CalculadoraBasica calculadoraBasica) {
		this.calculadoraBasica = calculadoraBasica;
	}


	public CalculadoraCientifica getCalculadoraCientifica() {
		return calculadoraCientifica;
	}


	public void setCalculadoraCientifica(CalculadoraCientifica calculadoraCientifica) {
		this.calculadoraCientifica = calculadoraCientifica;
	}
	
	@RequestMapping(value="/calculadora/{modelo}/suma",method=RequestMethod.GET,
				    produces="application/json", consumes="application/json")	
	public DTORespuesta suma(@RequestBody DTOOperacion operacion,@PathVariable("modelo") String modelo) {
		DTORespuesta dtoRespuesta = null;
		if(operacion != null && 
		   operacion.getParametro1() != null && 
		   operacion.getParametro2()!= null &&
		   modelo!= null){			
			dtoRespuesta = new DTORespuesta(calculadoraBasica.suma(operacion.getParametro1(), operacion.getParametro2()));			
		}
		return dtoRespuesta;
	}


	@Override
	public DTORespuesta resta(DTOOperacion operacion, String modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DTORespuesta multiplicacion(DTOOperacion operacion, String modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DTORespuesta division(DTOOperacion operacion, String modelo) {
		// TODO Auto-generated method stub
		return null;
	}

		
	
}
