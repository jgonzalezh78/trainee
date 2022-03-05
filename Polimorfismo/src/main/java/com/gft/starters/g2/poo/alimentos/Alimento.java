package com.gft.starters.g2.poo.alimentos;


public class Alimento {

	public String nombre = "Cualquier nombre";
	private double precio;
	private Double calorias;
	private final String nombreClase = this.getClass().getName();
	
	public Alimento(String nombre,
					double precio,
					Double calirias){
		this.nombre = nombre;
		this.precio = precio;
		this.calorias = calorias;
		System.out.println("Constructor Alimento");
	}
	public Alimento(){
		System.out.println("Constructor default");
	}
	
	
	@Override
	public String toString() {
		return "Alimento [nombre=" + nombre + ", precio=" + precio + ", calorias=" + calorias + "]";
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Double getCalorias() {
		return calorias;
	}
	public void setCalorias(Double calorias) {
		this.calorias = calorias;
	}
	
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
		System.out.println("produccion generica");
		return "produccion ["+nombreClase+"]";
	}
	
	public static String ventaAlimento(){
		return "Procesos de venta de alimento";
	}
	
	public static void main(String args[]){
		
	}
	
}
