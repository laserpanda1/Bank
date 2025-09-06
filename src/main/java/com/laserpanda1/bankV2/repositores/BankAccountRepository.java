package com.laserpanda1.bankV2.repositores;

import com.laserpanda1.bankV2.pojo.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
}
