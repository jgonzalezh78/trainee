package com.gft.trainee.apimarket.customer.facade.v1.mapper;

import org.springframework.stereotype.Component;

import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;
import com.gft.trainee.apimarket.customer.facade.v1.dto.DTOCustomer;

@Component
public class DTOCustomerMapper implements Mapper<DTOCustomer, IntCustomer> {

	@Override
	public IntCustomer inMapper(DTOCustomer dtoCustomer) {
		IntCustomer intCustomer = null;
		if(dtoCustomer != null) {
			intCustomer = new IntCustomer();
			intCustomer.setEdad(dtoCustomer.getEdad());
			intCustomer.setFechaNacimiento(dtoCustomer.getFechaNacimiento());
			intCustomer.setGenero(dtoCustomer.getGenero());
			intCustomer.setId(dtoCustomer.getId());
			intCustomer.setNombre(dtoCustomer.getNombre());			
		}
		return intCustomer;
	}

	@Override
	public DTOCustomer outMapper(IntCustomer intCustomer ) {
		DTOCustomer dtoCustomer = null;
		if(intCustomer != null) {
			dtoCustomer = new DTOCustomer();
			dtoCustomer.setEdad(intCustomer.getEdad());
			dtoCustomer.setFechaNacimiento(intCustomer.getFechaNacimiento());
			dtoCustomer.setGenero(intCustomer.getGenero());
			dtoCustomer.setId(intCustomer.getId());
			dtoCustomer.setNombre(intCustomer.getNombre());			
		}
		return dtoCustomer;
	}

}
