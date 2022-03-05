package com.gft.starters.g2.poo.collection.entity;

import org.junit.runner.manipulation.Sortable;
import org.junit.runner.manipulation.Sorter;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private int edad;
	private String sexo;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	public Persona(String nombre,int edad, String sexo ){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	
	@Override
	public int compareTo(Persona o) {
			int comaparacion = -1;
			if(o != null && (o.getClass() == this.getClass()) ){
				
				if(((Persona)o).getEdad() == this.edad){
					comaparacion = 0;
				}else if(this.edad  < ((Persona)o).getEdad()){
					comaparacion = -1;
				}else if(this.edad  > ((Persona)o).getEdad()){
					comaparacion = 1;
				}
			}		
			return comaparacion;
		}
	
}
