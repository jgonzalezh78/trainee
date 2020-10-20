package com.gft.trainees.g4.springstandalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gft.trainees.g4.springstandalone.otro.Transporte;

public class TestBeans {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");
		
		ICalculadora iCalculadora= (CalculadoraImpl) context.getBean("calculadora");
		System.out.println("suma ["+iCalculadora.suma(1, 1)+"]");	
	
		
		Empresa empresa= (Empresa) context.getBean("empresa");
		Transporte transporte = empresa.getTransporte();
		
		System.out.println("intancia["+empresa+"]["+transporte.getCompania()+"]");
		
		
		TestInyeccion testInyeccion= (TestInyeccion) context.getBean("testInyeccion");
		testInyeccion.testInyeccion();
		
		
	}
	
	
}
