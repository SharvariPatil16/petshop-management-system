package com.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.entity.Transaction;
import com.transaction.service.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction create(@RequestBody Transaction t) {
        return service.create(t);
    }

    @GetMapping("/{id}")
    public Transaction getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping("/customer/{customerId}")
    public List<Transaction> getByCustomer(@PathVariable Long customerId) {
        return service.getByCustomer(customerId);
    }

    @PutMapping("/{id}/status")
    public Transaction updateStatus(@PathVariable Long id,
                                   @RequestParam String status) {
        return service.updateStatus(id,
                Transaction.Status.valueOf(status.toUpperCase()));
    }
}