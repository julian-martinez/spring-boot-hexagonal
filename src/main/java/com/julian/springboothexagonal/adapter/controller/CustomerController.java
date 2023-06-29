package com.julian.springboothexagonal.adapter.controller;

import com.julian.springboothexagonal.adapter.model.CustomerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public interface CustomerController {

    @PostMapping("/add")
    CustomerDto createNewCustomer(CustomerDto request);
    @GetMapping("get/{id}")
    CustomerDto readCustomerById(Long id);
}
