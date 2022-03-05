package com.gft.starters.g2.poo.patterns;

import java.util.Date;

public class Mercado {

	private String nombre;
	private String direccion;
	private Date fechaIgnaguracion;
	
	
	public Mercado(String nombre, String direccion, Date fechaIgnaguracion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.fechaIgnaguracion = fechaIgnaguracion;
	}
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
