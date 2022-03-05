package com.gft.starters.g2.poo.patterns;

public class Libro {

	private static Libro libro;
	private int contador;
	private String titulo = "CualquierNombre";
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	private Libro(){
		contador++;
		System.out.println("Numero de instancias["+contador+"]");
	}
	
	public static Libro getInstance(){		
		if(libro == null){
			libro = new Libro();
		}		
		return libro;
	}
	
}
