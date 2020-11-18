package com.gft.trainee.apimarket.customer.facade.v1.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOCustomer {

	private Long id;
	private String nombre;
	private Integer edad;
	private String genero;
	private Date fechaNacimiento;
	
}
