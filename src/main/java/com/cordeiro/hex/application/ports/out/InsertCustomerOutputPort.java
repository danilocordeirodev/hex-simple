package com.cordeiro.hex.application.ports.out;

import com.cordeiro.hex.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);
}
