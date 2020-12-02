package com.gft.trainee.apimarket.customer.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gft.trainee.apimarket.customer.business.ICustomerInt;
import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;
import com.gft.trainee.apimarket.customer.dao.ICustomerDAO;

@Component
public class CustomerInt implements ICustomerInt {

	@Autowired
	private ICustomerDAO customerDAO;
	
	
	@Override
	public IntCustomer createCustomer(IntCustomer intCustomer) {		
		return customerDAO.createCustomer(intCustomer);
	}

	@Override
	public IntCustomer updateCustomer(IntCustomer intCustomer) throws Exception {
		return customerDAO.updateCustomer(intCustomer);
	}

	@Override
	public Boolean deleteCustomer(IntCustomer intCustomer) {
		return customerDAO.deleteCustomer(intCustomer);
		
	}

	@Override
	public IntCustomer getCustomer(IntCustomer intCustomer) {
		return customerDAO.getCustomer(intCustomer);
	}

	@Override
	public List<IntCustomer> getCustomer() {
		return customerDAO.getCustomer();
	}

}
