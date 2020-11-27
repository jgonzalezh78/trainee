package com.gft.trainee.apimarket.customer.dao.mapper;

import org.mapstruct.Mapper;

import com.gft.trainee.apimarket.customer.business.dto.IntCustomer;
import com.gft.trainee.apimarket.customer.dao.model.CustomerEntity;

@Mapper(componentModel = "spring")
public interface ICustomerDAOMapper {

	CustomerEntity IntCustomerToCustomerEntity(IntCustomer intCustomer);
	IntCustomer CustomerEntityToIntCustomer(CustomerEntity customerEntity);

}
