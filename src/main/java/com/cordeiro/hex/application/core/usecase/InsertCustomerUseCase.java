package com.cordeiro.hex.application.core.usecase;

import com.cordeiro.hex.application.core.domain.Customer;
import com.cordeiro.hex.application.ports.in.InsertCustomerInputPort;
import com.cordeiro.hex.application.ports.out.FindAddressByZipCodeOutputPort;
import com.cordeiro.hex.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort  = insertCustomerOutputPort;
    }
    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
