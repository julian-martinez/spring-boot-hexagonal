package com.julian.springboothexagonal.domain.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Customer {

    private Long id;
    private String fullName;
    private String dni;
}
