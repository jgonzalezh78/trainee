package com.gft.trainee.apimarket.customer.facade.v1.mapper;

public interface Mapper<I,O> {

	O inMapper(I i);
	I outMapper(O o);
	
	
}
