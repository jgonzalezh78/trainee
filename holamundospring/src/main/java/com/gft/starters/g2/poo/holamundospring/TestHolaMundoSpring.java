package com.gft.starters.g2.poo.holamundospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHolaMundoSpring {

	public static void main(String args[]){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("my-beans.xml");
		Calculadora calculadora = (Calculadora)context.getBean("calculadora");
		System.out.println( "Calculadora "+calculadora+"] ["+calculadora.getModelo()+"]["+calculadora.getMarca()+"]");
		
		
	}
	
	
}
