package com.laserpanda1.bankV2.repositores;

import com.laserpanda1.bankV2.pojo.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
