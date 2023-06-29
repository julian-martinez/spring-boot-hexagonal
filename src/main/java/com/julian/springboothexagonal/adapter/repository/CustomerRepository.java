package com.julian.springboothexagonal.adapter.repository;

import com.julian.springboothexagonal.adapter.model.CustomerDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerDao, Long> {
}
