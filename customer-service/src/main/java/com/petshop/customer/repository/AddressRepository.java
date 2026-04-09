package com.petshop.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.petshop.customer.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}