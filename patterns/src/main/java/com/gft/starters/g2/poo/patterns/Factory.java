package com.gft.starters.g2.poo.patterns;

import java.util.Date;

public class Factory {

	public static Biblioteca getBiblioteca(){
		Biblioteca biblioteca = new Biblioteca("nombre", "direccion", new Date());		
		return  biblioteca;
	}
	
	public static Mercado getMercado(){
		Mercado mercado = new Mercado("nombre", "direccion", new Date());		
		return  mercado;
	}
	
	
}
