package com.laserpanda1.bankV2.repositores;

import com.laserpanda1.bankV2.pojo.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank, Long> {
}
