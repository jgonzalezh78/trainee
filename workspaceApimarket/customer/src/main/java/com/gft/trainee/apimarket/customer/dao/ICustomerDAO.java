package com.gft.trainee.apimarket.customer.dao;

import java.util.List;

import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;

public interface ICustomerDAO {

	public IntCustomer createCustomer(IntCustomer CustomerEntity);
	public IntCustomer updateCustomer(IntCustomer CustomerEntity)  throws Exception;
	public Boolean deleteCustomer(IntCustomer CustomerEntity);
	public IntCustomer getCustomer(IntCustomer CustomerEntity);
	public List<IntCustomer> getCustomer();
	
}
