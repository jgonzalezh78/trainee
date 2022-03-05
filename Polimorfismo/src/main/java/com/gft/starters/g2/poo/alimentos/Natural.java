package com.gft.starters.g2.poo.alimentos;

public class Natural extends Alimento {

	private final String nombreClase = this.getClass().getName();
	
	public Natural(String nombre,double precio,Double calorias){		
		super(nombre,precio,calorias);
		System.out.println("Constructor Natural");		
	}
	
	public Natural(String nombre,double precio){		
		super(nombre,precio,10.0);		
		System.out.println("Constructor dos argumentos");
		System.out.println();
	}
	
	public Natural(double precio,String nombre){		
		super(nombre,precio,10.0);
		System.out.println("Constructor dos argumentos");
		System.out.println();
	}

	
	
	public Natural(String nombre,int precio){		
		super(nombre,precio,10.0);
		System.out.println("Constructor dos argumentos");
	}
	
	public String procesaAlimento(){
		System.out.println("clase["+nombreClase+"]");
		return "procesaAlimento["+nombreClase+"]";
	}
	
	public String empaquetado(){
		System.out.println("clase["+nombreClase+"]");
		System.out.println("lavar previamente");
		System.out.println("desinfecta");
		return "empaquetado ["+nombreClase+"]";
	}
	
//	public String produccion(){
//		System.out.println("clase["+nombreClase+"]");
//		System.out.println("simebra");		
//		return "produccion ["+nombreClase+"]";
//	}
	
}
