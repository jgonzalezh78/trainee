package com.gft.trainee.apimarket.customer.business.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class IntCustomer {

	private Long id;
	private String nombre;
	private Integer edad;
	private String genero;
	private Date fechaNacimiento;
	
}
