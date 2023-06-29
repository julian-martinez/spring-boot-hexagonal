package com.julian.springboothexagonal.configuration;

import com.julian.springboothexagonal.adapter.controller.CustomerController;
import com.julian.springboothexagonal.adapter.controller.CustomerRestController;
import com.julian.springboothexagonal.adapter.repository.CustomerH2Repository;
import com.julian.springboothexagonal.adapter.repository.CustomerRepository;
import com.julian.springboothexagonal.application.CustomerPersistence;
import com.julian.springboothexagonal.application.CustomerUseCase;
import com.julian.springboothexagonal.domain.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

    @Bean
    public CustomerController customerController(final CustomerUseCase customerUseCase) {
        return new CustomerRestController(customerUseCase);
    }

    @Bean
    public CustomerUseCase customerUseCase(final CustomerPersistence customerPersistence) {
        return new CustomerService(customerPersistence);
    }

    @Bean
    public CustomerPersistence customerPersistence(final CustomerRepository customerRepository) {
        return new CustomerH2Repository(customerRepository);
    }

}
