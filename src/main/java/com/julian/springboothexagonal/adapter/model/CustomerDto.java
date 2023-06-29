package com.julian.springboothexagonal.adapter.model;

import com.julian.springboothexagonal.domain.model.Customer;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerDto {

    private Long id;
    private String fullName;
    private String dni;

    public Customer toDomain() {
        return Customer.builder()
                .id(this.id)
                .fullName(this.fullName)
                .dni(this.dni)
                .build();
    }

    public static CustomerDto from(final Customer customer) {
        return CustomerDto.builder()
                .id(customer.getId())
                .fullName(customer.getFullName())
                .dni(customer.getDni())
                .build();
    }
}
