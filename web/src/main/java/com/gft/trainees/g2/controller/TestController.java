package com.gft.trainees.g2.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("materia")
public class TestController {
    
	@RequestMapping(value="/economia", produces = {MediaType.APPLICATION_JSON_VALUE},  method= RequestMethod.POST )
	public String alta(@RequestBody Materia materia){
		return "alta con id ";
	}
	
	@RequestMapping(value="/economia/{id}", produces = {MediaType.APPLICATION_JSON_VALUE},method= RequestMethod.DELETE )
	public String baja(@PathVariable ("id") long id){
		System.out.println("id["+id+"]");
		;
		return "baja de "+id;
	}
	
	@RequestMapping(value="/economia/{id}", produces = {MediaType.APPLICATION_JSON_VALUE},method= RequestMethod.PUT)
	public String cambio(@PathVariable ("id") long id,@RequestBody Materia materia ){
		System.out.println("id["+id+"]");
		return "cambio "+ id;
	}
	
	@RequestMapping(value="/economia", produces = {MediaType.APPLICATION_JSON_VALUE},method= RequestMethod.GET )
	public List<Materia> consulta(){
		System.out.println("consulta lista de materias");
		return null;
	}

	@RequestMapping(value="/economia/{id}", produces = {MediaType.APPLICATION_JSON_VALUE},method= RequestMethod.GET )
	public Materia consulta(@PathVariable("id") long id){		
		System.out.println("consulta materia por id");
		return null;
	}

	
}