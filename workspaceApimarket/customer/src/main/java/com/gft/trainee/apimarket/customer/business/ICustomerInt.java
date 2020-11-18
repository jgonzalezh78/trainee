package com.gft.trainee.apimarket.customer.business;

import java.util.List;

import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;

public interface ICustomerInt {

	public IntCustomer createCustomer(IntCustomer dtoCustomer);
	public IntCustomer updateCustomer(IntCustomer dtoCustomer,Long id);
	public IntCustomer deleeCustomer(IntCustomer dtoCustomer,Long id);
	public IntCustomer getCustomer(IntCustomer dtoCustomer);
	public List<IntCustomer> getCustomer();
	
}
