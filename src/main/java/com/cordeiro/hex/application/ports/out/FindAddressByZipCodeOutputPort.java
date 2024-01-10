package com.cordeiro.hex.application.ports.out;

import com.cordeiro.hex.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
