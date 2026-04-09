package com.transaction.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.entity.Transaction;
import com.transaction.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repo;

    public Transaction create(Transaction t) {
        t.setTransactionDate(LocalDate.now());
        t.setTransactionStatus(Transaction.Status.SUCCESS);
        return repo.save(t);
    }

    public Transaction getById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction not found"));
    }

    public List<Transaction> getByCustomer(Long customerId) {
        return repo.findByCustomerId(customerId);
    }

    public Transaction updateStatus(Long id, Transaction.Status status) {
        Transaction t = repo.findById(id).orElseThrow();
        t.setTransactionStatus(status);
        return repo.save(t);
    }
}