
package com.gft.trainees.g2.controller;

public class Materia {

	private Long id;
	private String name;
	
	public Materia(){
	}
	
	public Materia(String name,Long id){
		this.name = name;
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
