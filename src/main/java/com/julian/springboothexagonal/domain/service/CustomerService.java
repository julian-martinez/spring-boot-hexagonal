package com.julian.springboothexagonal.domain.service;

import com.julian.springboothexagonal.application.CustomerPersistence;
import com.julian.springboothexagonal.application.CustomerUseCase;
import com.julian.springboothexagonal.domain.model.Customer;

public class CustomerService implements CustomerUseCase {

    private final CustomerPersistence persistence;

    public CustomerService(final CustomerPersistence persistence) {
        this.persistence = persistence;
    }

    @Override
    public Customer createNewCustomer(final Customer customer) {
        return this.persistence.save(customer);
    }

    @Override
    public Customer readCustomerById(final Long id) {
        return this.persistence.getById(id);
    }
}
