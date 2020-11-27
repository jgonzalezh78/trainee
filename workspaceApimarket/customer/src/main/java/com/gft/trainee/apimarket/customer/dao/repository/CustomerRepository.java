package com.gft.trainee.apimarket.customer.dao.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gft.trainee.apimarket.customer.dao.model.CustomerEntity;

@Repository
public interface CustomerRepository extends  CrudRepository<CustomerEntity, Long> {

}
