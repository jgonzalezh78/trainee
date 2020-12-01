package com.gft.trainee.apimarket.customer.facade.v1.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	@GetMapping(path = "/{id}")
	public ResponseEntity<DTOCustomer> getCustomer(@PathVariable Long id) {

		DTOCustomer dtoCustomer = null;
		HttpHeaders headers = new HttpHeaders();
		if(id != null && id > 0) {
			dtoCustomer = new DTOCustomer();
			dtoCustomer.setId(id);
			
			dtoCustomer = mapperCustomer.outMapper(
							customerInt.getCustomer(mapperCustomer.inMapper(dtoCustomer)));
			headers.add("myheader", "cualquiera");
		}
		return new ResponseEntity<DTOCustomer>(dtoCustomer,headers,dtoCustomer!=null?HttpStatus.FOUND:HttpStatus.NOT_FOUND);
	}

	@GetMapping
	public List<DTOCustomer> getCustomer() {
		
		/*
		List<IntCustomer> intCustomerList = customerInt.getCustomer();
		List<DTOCustomer> dtoCustomerList = null;
		
		if(intCustomerList != null && intCustomerList.size()>0) {
			dtoCustomerList = new ArrayList();			
			for(IntCustomer intcustomer:intCustomerList) {
				dtoCustomerList.add(mapperCustomer.outMapper(intcustomer));
			}
		}*/
		
		/*
		List<DTOCustomer> dtoCustomerList = customerInt.getCustomer().stream()
											.map(intCustomer -> mapperCustomer.outMapper(intCustomer))
											.collect(Collectors.toList());
		*/
		

		List<DTOCustomer> dtoCustomerList = customerInt.getCustomer()
											.parallelStream()
											.map(intCustomer -> mapperCustomer.outMapper(intCustomer))											
											.collect(Collectors.toList());
											
		
		return dtoCustomerList;
	}

}
