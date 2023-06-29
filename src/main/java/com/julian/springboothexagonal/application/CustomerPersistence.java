package com.julian.springboothexagonal.application;

import com.julian.springboothexagonal.domain.model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPersistence {

    Customer save(Customer customer);
    Customer getById(Long id);
}
