package com.cordeiro.hex.application.ports.in;

import com.cordeiro.hex.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
