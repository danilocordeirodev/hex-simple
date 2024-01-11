package com.cordeiro.hex.application.ports.out;

import com.cordeiro.hex.application.core.domain.Customer;

public interface DeleteCustomerByIdOutputPort {
    void delete(String id);
}
