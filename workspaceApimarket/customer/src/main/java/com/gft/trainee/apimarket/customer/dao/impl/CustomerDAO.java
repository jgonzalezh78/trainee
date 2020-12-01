package com.gft.trainee.apimarket.customer.dao.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;
import com.gft.trainee.apimarket.customer.dao.ICustomerDAO;
import com.gft.trainee.apimarket.customer.dao.mapper.ICustomerDAOMapper;
import com.gft.trainee.apimarket.customer.dao.model.CustomerEntity;
import com.gft.trainee.apimarket.customer.dao.repository.CustomerRepository;

@Component
public class CustomerDAO implements ICustomerDAO {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ICustomerDAOMapper customerDAOMapper;
	
	@Override
	public IntCustomer createCustomer(IntCustomer intCustomer) {
		
		return customerDAOMapper.CustomerEntityToIntCustomer(
				customerRepository.save(customerDAOMapper.IntCustomerToCustomerEntity(intCustomer)));
		
	}

	@Override
	public IntCustomer updateCustomer(IntCustomer CustomerEntity, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntCustomer deleeCustomer(IntCustomer CustomerEntity, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IntCustomer getCustomer(IntCustomer intCustomer) {		
		Optional<CustomerEntity> optionaCustomerEntity  = customerRepository.findById(customerDAOMapper.IntCustomerToCustomerEntity(intCustomer).getId());
		CustomerEntity customerEntity = optionaCustomerEntity.isPresent()?optionaCustomerEntity.get():null;
		IntCustomer intCustomerSalida = customerDAOMapper.CustomerEntityToIntCustomer(customerEntity);
		return intCustomerSalida;
	}

	@Override
	public List<IntCustomer> getCustomer() {
		
		Iterable<CustomerEntity> customerIterable = customerRepository.findAll();
		List<CustomerEntity> customerEntirtyList = (List<CustomerEntity>)customerIterable;
		List<IntCustomer>  intCustomerList  = customerEntirtyList
												.stream()
												.map(x -> customerDAOMapper.CustomerEntityToIntCustomer(x))
												.collect(Collectors.toList());
		
		return intCustomerList;
	}

	
}
