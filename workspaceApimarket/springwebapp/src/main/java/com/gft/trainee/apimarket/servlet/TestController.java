package com.gft.trainee.apimarket.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gft.trainee.apimarket.beans.ClaseA;

@RestController
@RequestMapping("testspring")
public class TestController {

	@Autowired
	private ClaseA clasea;
	
	@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.POST)
	public void test(){
		System.out.println("POST inyeccion ["+clasea+"]");
		
	}
	@RequestMapping(produces = {MediaType.APPLICATION_JSON_VALUE}, method = RequestMethod.GET)
	public void test2(){
		System.out.println("POST inyeccion ["+clasea+"]");
		
	}
	
}
