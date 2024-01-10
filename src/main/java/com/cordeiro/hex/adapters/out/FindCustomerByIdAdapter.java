package com.cordeiro.hex.adapters.out;

import com.cordeiro.hex.adapters.out.repository.CustomerRepository;
import com.cordeiro.hex.adapters.out.repository.mapper.CustomerEntityMapper;
import com.cordeiro.hex.application.core.domain.Customer;
import com.cordeiro.hex.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;
    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);

        return customerEntity.map(entity -> customerEntityMapper.toCostumer(entity));
    }
}
