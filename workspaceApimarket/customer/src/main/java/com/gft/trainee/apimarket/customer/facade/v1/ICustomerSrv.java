package com.gft.trainee.apimarket.customer.facade.v1;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.gft.trainee.apimarket.customer.facade.v1.dto.DTOCustomer;

public interface ICustomerSrv {

	public DTOCustomer createCustomer(DTOCustomer dtoCustomer);
	public ResponseEntity<DTOCustomer> updateCustomer(DTOCustomer dtoCustomer,Long id);
	public ResponseEntity<Boolean> deleteCustomer(Long id);
	public ResponseEntity<DTOCustomer> getCustomer(Long id);
	public List<DTOCustomer> getCustomer();
	
}
