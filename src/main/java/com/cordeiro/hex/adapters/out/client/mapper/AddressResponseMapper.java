package com.cordeiro.hex.adapters.out.client.mapper;

import com.cordeiro.hex.adapters.out.client.response.AddressResponse;
import com.cordeiro.hex.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
