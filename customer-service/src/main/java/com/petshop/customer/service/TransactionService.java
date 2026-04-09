package com.petshop.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.petshop.customer.entity.Transaction;
import com.petshop.customer.repository.TransactionRepository;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    // Save Transaction
    public Transaction save(Transaction transaction) {
        return repository.save(transaction);
    }

    // Get All Transactions
    public List<Transaction> getAll() {
        return repository.findAll();
    }

    // Get Transaction By ID
    public Optional<Transaction> getById(Long id) {
        return repository.findById(id);
    }

    // Delete Transaction
    public String delete(Long id) {
        repository.deleteById(id);
        return "Transaction deleted successfully!";
    }

    // Update Transaction
    public Transaction update(Long id, Transaction newTransaction) {
        return repository.findById(id).map(transaction -> {

            transaction.setAmount(newTransaction.getAmount());
            transaction.setTransactionStatus(newTransaction.getTransactionStatus());
            transaction.setTransactionDate(newTransaction.getTransactionDate());

            return repository.save(transaction);

        }).orElseThrow(() -> new RuntimeException("Transaction not found"));
    }
}