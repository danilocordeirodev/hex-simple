package com.cordeiro.hex.adapters.in.consumer;

import com.cordeiro.hex.adapters.in.consumer.mapper.CustomerMessageMapper;
import com.cordeiro.hex.adapters.in.consumer.message.CustomerMessage;
import com.cordeiro.hex.application.ports.in.UpdateCustomerInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidatedCpfConsumer {
    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "cordeiro")
    public void receive(CustomerMessage customerMessage) {
        updateCustomerInputPort.update(customerMessageMapper.toCustomer(customerMessage), customerMessage.getZipCode());
    }
}
