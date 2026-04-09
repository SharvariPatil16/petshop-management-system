package com.petshop.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.petshop.customer.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}