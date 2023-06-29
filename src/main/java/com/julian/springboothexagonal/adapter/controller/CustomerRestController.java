package com.julian.springboothexagonal.adapter.controller;

import com.julian.springboothexagonal.adapter.model.CustomerDto;
import com.julian.springboothexagonal.application.CustomerUseCase;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


public class CustomerRestController implements CustomerController {

    private final CustomerUseCase customerUseCase;

    public CustomerRestController(final CustomerUseCase customerUseCase) {
        this.customerUseCase = customerUseCase;
    }

    @Override
    public CustomerDto createNewCustomer(@RequestBody final CustomerDto request) {
        return CustomerDto.from(this.customerUseCase.createNewCustomer(request.toDomain()));
    }

    @Override
    public CustomerDto readCustomerById(@PathVariable final Long id) {
        return CustomerDto.from(this.customerUseCase.readCustomerById(id));
    }
}
