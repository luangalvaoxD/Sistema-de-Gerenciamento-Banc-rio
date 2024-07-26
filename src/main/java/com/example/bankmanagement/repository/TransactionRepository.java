package com.example.bankmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bankmanagement.model.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
