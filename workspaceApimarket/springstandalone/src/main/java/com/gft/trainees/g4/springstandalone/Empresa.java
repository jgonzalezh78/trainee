package com.gft.trainees.g4.springstandalone;

import com.gft.trainees.g4.springstandalone.otro.Transporte;

public class Empresa {

	private String nombre;
	private Transporte transporte;
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Transporte getTransporte() {
		return transporte;
	}


	public void setTransporte(Transporte transporte) {
		this.transporte = transporte;
	}


	public Empresa( Transporte transporte) {
		this.nombre = "nombre";
		this.transporte = transporte;
	}
	
}
