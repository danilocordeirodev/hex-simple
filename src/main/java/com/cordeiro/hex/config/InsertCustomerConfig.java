package com.cordeiro.hex.config;

import com.cordeiro.hex.adapters.out.FindAddressByZipCodeAdapter;
import com.cordeiro.hex.adapters.out.InsertCustomerAdapter;
import com.cordeiro.hex.adapters.out.SendCpfValidationAdapter;
import com.cordeiro.hex.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,
                insertCustomerAdapter,
                sendCpfValidationAdapter);
    }
}
