package com.gft.starters.g2.poo.alimentos;

public class Procesado extends Alimento{

private final String nombreClase = this.getClass().getName();
	
	public String procesaAlimento(){
		System.out.println("clase["+nombreClase+"]");
		return "procesaAlimento["+nombreClase+"]";
	}
	
	public String empaquetado(){
		System.out.println("clase["+nombreClase+"]");
		return "empaquetado ["+nombreClase+"]";
	}
	
	public String produccion(){
		System.out.println("clase["+nombreClase+"]");
		return "produccion ["+nombreClase+"]";
	}

	
}
