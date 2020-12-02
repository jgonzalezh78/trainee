package com.gft.trainee.apimarket.customer.business;

import java.util.List;

import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;

public interface ICustomerInt {

	public IntCustomer createCustomer(IntCustomer dtoCustomer);
	public IntCustomer updateCustomer(IntCustomer dtoCustomer)throws Exception;
	public Boolean deleteCustomer(IntCustomer dtoCustomer);
	public IntCustomer getCustomer(IntCustomer dtoCustomer);
	public List<IntCustomer> getCustomer();
	
}
