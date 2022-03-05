package com.gft.starters.g2.poo.holamundospring;

public class Calculo {

	private Calculadora calculadora;
	private String calculo;
	private int dias;
	private double salario;
	
	
	public int getDias() {
		return dias;
	}



	public void setDias(int dias) {
		this.dias = dias;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public Calculadora getCalculadora() {
		return calculadora;
	}



	public void setCalculadora(Calculadora calculadora) {
		this.calculadora = calculadora;
	}



	public String getCalculo() {
		return calculo;
	}



	public void setCalculo(String calculo) {
		this.calculo = calculo;
	}



	public Calculo(Calculadora calculadora,String calculo, double salario, int dias){	
		System.out.println("Calculo");
		this.calculadora = calculadora;
		this.calculo = calculo;
		this.salario = salario;
		this.dias = dias;		
	}
	
	
	
}
