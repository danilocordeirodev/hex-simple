package com.cordeiro.hex.application.ports.in;

import com.cordeiro.hex.application.core.domain.Customer;

public interface InsertCustomerInputPort {
    void insert(Customer customer, String zipCode);
}
