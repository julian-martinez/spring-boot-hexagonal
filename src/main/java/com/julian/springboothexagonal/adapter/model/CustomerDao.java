package com.julian.springboothexagonal.adapter.model;

import com.julian.springboothexagonal.domain.model.Customer;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDao {
    @Id
    @GeneratedValue
    private Long id;
    @Nonnull
    @Column
    private String fullName;
    @Nonnull
    @Column
    private String dni;

    public Customer toDomain() {
        return Customer.builder()
                .id(this.id)
                .fullName(this.fullName)
                .dni(this.dni)
                .build();
    }

    public static CustomerDao from(final Customer customer) {
        return new CustomerDao(customer.getId(), customer.getFullName(), customer.getDni());
    }
}
