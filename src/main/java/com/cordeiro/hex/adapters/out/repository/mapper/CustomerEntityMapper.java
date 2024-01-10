package com.cordeiro.hex.adapters.out.repository.mapper;

import com.cordeiro.hex.adapters.out.repository.entity.CustomerEntity;
import com.cordeiro.hex.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);
}
