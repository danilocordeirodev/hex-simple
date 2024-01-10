package com.cordeiro.hex.application.ports.in;

import com.cordeiro.hex.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
