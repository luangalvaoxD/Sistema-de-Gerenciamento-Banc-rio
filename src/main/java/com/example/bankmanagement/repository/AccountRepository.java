package com.example.bankmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bankmanagement.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
