package com.gft.trainee.apimarket.customer.dao;

import java.util.List;

import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;

public interface ICustomerDAO {

	public IntCustomer createCustomer(IntCustomer CustomerEntity);
	public IntCustomer updateCustomer(IntCustomer CustomerEntity,Long id);
	public IntCustomer deleeCustomer(IntCustomer CustomerEntity,Long id);
	public IntCustomer getCustomer(IntCustomer CustomerEntity);
	public List<IntCustomer> getCustomer();
	
}
