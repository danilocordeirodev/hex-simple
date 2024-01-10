package com.cordeiro.hex.adapters.in.controller.response;

import com.cordeiro.hex.adapters.out.client.response.AddressResponse;

import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private AddressResponse address;

    private String cpf;

    private Boolean isValidCpf;
}
