package com.cordeiro.hex.config;

import com.cordeiro.hex.adapters.out.FindAddressByZipCodeAdapter;
import com.cordeiro.hex.adapters.out.FindCustomerByIdAdapter;
import com.cordeiro.hex.adapters.out.InsertCustomerAdapter;
import com.cordeiro.hex.application.core.usecase.FindCustomerByIdUseCase;
import com.cordeiro.hex.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
            FindCustomerByIdAdapter findCustomerByIdAdapter
    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
