package com.gft.trainees.g4.springstandalone;

import org.springframework.beans.factory.annotation.Autowired;

import com.gft.trainees.g4.springstandalone.otro.Transporte;

public class TestInyeccion {

	@Autowired
	private Empresa empresa;
	@Autowired
	private Transporte transporte;
	
	
	public Empresa getEmpresa() {
		return empresa;
	}


	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}


	public Transporte getTransporte() {
		return transporte;
	}


	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}


	public void testInyeccion() {
		System.out.println("empresa["+empresa+"] transporte["+transporte+"]");
	}
	
	
	
}
