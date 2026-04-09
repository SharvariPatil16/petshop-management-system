package com.petshop.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.petshop.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}