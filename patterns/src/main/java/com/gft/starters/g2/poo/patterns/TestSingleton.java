package com.gft.starters.g2.poo.patterns;

public class TestSingleton {

	public static void main(String args[]){
		
		Libro libro = Libro.getInstance();
		System.out.println("titulo["+libro.getTitulo()+"]");
		Libro libro2 = Libro.getInstance();
		System.out.println("titulo["+libro2.getTitulo()+"]");
		
	}
	
	
}
