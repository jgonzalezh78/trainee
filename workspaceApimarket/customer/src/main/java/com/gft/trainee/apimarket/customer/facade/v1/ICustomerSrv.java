package com.gft.trainee.apimarket.customer.facade.v1;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.gft.trainee.apimarket.customer.facade.v1.dto.DTOCustomer;

public interface ICustomerSrv {

	public DTOCustomer createCustomer(DTOCustomer dtoCustomer);
	public DTOCustomer updateCustomer(DTOCustomer dtoCustomer,Long id);
	public DTOCustomer deleeCustomer(DTOCustomer dtoCustomer,Long id);
	public ResponseEntity getCustomer(Long id);
	public List<DTOCustomer> getCustomer();
	
}
