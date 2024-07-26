package com.example.bankmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.bankmanagement")
public class BankManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(BankManagementApplication.class, args);
    }
}
