package com.cordeiro.hex.config;

import com.cordeiro.hex.adapters.out.FindAddressByZipCodeAdapter;
import com.cordeiro.hex.adapters.out.FindCustomerByIdAdapter;
import com.cordeiro.hex.adapters.out.UpdateCustomerAdapter;
import com.cordeiro.hex.application.core.usecase.FindCustomerByIdUseCase;
import com.cordeiro.hex.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
