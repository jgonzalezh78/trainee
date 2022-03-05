package com.gft.starters.g2.poo.patterns;

import java.util.Date;

public class Hospital implements Cloneable {


	public Object clone(){
		Object obj = null;		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		
		return obj;
	}
	
	@Override
	public String toString() {
		return "Hospital [direccion=" + direccion + ", fechaIgnaguracion=" + fechaIgnaguracion + ", nombre=" + nombre
				+ "]";
	}
	public Hospital(String nombre, String direccion, Date fechaIgnaguracion) {
		super();
		System.out.println("Cosntructor de Hospital");
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaIgnaguracion = fechaIgnaguracion;
	}
	private String direccion;
	private Date fechaIgnaguracion;
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechaIgnaguracion() {
		return fechaIgnaguracion;
	}
	public void setFechaIgnaguracion(Date fechaIgnaguracion) {
		this.fechaIgnaguracion = fechaIgnaguracion;
	}
	
}
