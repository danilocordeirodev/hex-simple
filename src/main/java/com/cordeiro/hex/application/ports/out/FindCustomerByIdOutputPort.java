package com.cordeiro.hex.application.ports.out;

import com.cordeiro.hex.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {
    Optional<Customer> find(String id);
}
