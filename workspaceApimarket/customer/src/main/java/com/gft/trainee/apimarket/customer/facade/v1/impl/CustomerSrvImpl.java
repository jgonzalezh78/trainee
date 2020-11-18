package com.gft.trainee.apimarket.customer.facade.v1.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gft.trainee.apimarket.customer.business.ICustomerInt;
import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;
import com.gft.trainee.apimarket.customer.facade.v1.ICustomerSrv;
import com.gft.trainee.apimarket.customer.facade.v1.dto.DTOCustomer;
import com.gft.trainee.apimarket.customer.facade.v1.mapper.Mapper;

@RestController
@RequestMapping("/gft/customer")
public class CustomerSrvImpl implements ICustomerSrv {

	@Autowired
	@Qualifier("customerInt")
	//private CustomerInt customerInt;
	private ICustomerInt customerInt;
	
	@Autowired
	private Mapper<DTOCustomer, IntCustomer> mapperCustomer;
		
	//@RequestMapping(method = RequestMethod.POST, path = "")
	@PostMapping()
	public DTOCustomer createCustomer(@RequestBody DTOCustomer dtoCustomer) {
		
		return mapperCustomer.outMapper(
				customerInt.createCustomer(mapperCustomer.inMapper(dtoCustomer)));
	}

	@Override
	public DTOCustomer updateCustomer(DTOCustomer dtoCustomer, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DTOCustomer deleeCustomer(DTOCustomer dtoCustomer, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity getCustomer(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DTOCustomer> getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

}
