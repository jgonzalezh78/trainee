package com.gft.trainee.apimarket.customer.dao;

import java.util.List;

import com.gft.trainee.apimarket.customer.dao.model.CustomerEntity;

public interface ICustomerDAO {

	public CustomerEntity createCustomer(CustomerEntity CustomerEntity);
	public CustomerEntity updateCustomer(CustomerEntity CustomerEntity,Long id);
	public CustomerEntity deleeCustomer(CustomerEntity CustomerEntity,Long id);
	public CustomerEntity getCustomer(CustomerEntity CustomerEntity);
	public List<CustomerEntity> getCustomer();
	
}
