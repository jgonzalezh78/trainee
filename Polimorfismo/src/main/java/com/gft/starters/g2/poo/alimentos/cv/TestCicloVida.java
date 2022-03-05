package com.gft.starters.g2.poo.alimentos.cv;

public class TestCicloVida {

	private int intPrivimitivo;
	private Integer integerWrraper;
	private static int intStatic;
	
	
	public TestCicloVida(){
		System.out.println("Constructor");
		System.out.println("intPrivimitivo["+intPrivimitivo+"]intStatic["+intStatic+"]integerWrraper["+integerWrraper+"]");
	}
	
	{
		System.out.println("Bloque vacio");
	}
	
	static {
		System.out.println("Bloque estatico");
		System.out.println("intStatic["+intStatic+"]");
		intStatic++;
	}
	
	public static void main(String args[]){
		TestCicloVida p = new TestCicloVida();
	}
	
	
}
