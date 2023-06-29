package com.julian.springboothexagonal.adapter.repository;

import com.julian.springboothexagonal.adapter.model.CustomerDao;
import com.julian.springboothexagonal.application.CustomerPersistence;
import com.julian.springboothexagonal.domain.model.Customer;

public class CustomerH2Repository implements CustomerPersistence {

    private final CustomerRepository repository;

    public CustomerH2Repository(final CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer save(final Customer customer) {
        return this.repository.save(CustomerDao.from(customer)).toDomain();
    }

    @Override
    public Customer getById(final Long id) {
        return this.repository.findById(id)
                .map(CustomerDao::toDomain)
                .orElseThrow();
    }
}
