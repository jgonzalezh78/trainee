package com.gft.staters.g2.spring;

public class Calculadora {

	private String modelo;
	private String marca;
	
	public Calculadora(){
		System.out.println("Calculadora");
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double suma(Double operador1, Double operador2 ){
		return null;
	}	
	public Double resta(Double operador1, Double operador2 ){
		return null;
	}
	public Double multiplicacion(Double operador1, Double operador2 ){
		return null;
	}
	public Double division(Double operador1, Double operador2 ){
		return null;
	}
	
	
}
