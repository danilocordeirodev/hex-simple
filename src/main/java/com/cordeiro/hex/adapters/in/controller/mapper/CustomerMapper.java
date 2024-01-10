package com.cordeiro.hex.adapters.in.controller.mapper;

import com.cordeiro.hex.adapters.in.controller.request.CustomerRequest;
import com.cordeiro.hex.adapters.in.controller.response.CustomerResponse;
import com.cordeiro.hex.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);
}
