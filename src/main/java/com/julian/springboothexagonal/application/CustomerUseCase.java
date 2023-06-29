package com.julian.springboothexagonal.application;

import com.julian.springboothexagonal.domain.model.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerUseCase {

    Customer createNewCustomer(Customer customer);
    Customer readCustomerById(Long id);
}
