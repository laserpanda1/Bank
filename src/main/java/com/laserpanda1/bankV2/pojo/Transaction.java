package com.laserpanda1.bankV2.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    private BigDecimal amount;

    private String currency;

    @Enumerated(EnumType.STRING)
    private TransactionStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "source_account_id")
    private BankAccount sourceAccount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "target_account_id")
    private BankAccount targetAccount;

    public Transaction(TransactionType type, BigDecimal amount, String currency,
                       BankAccount sourceAccount, BankAccount targetAccount)
    {
        this.type = type;
        this.amount = amount;
        this.currency = currency;
        this.sourceAccount = sourceAccount;
        this.targetAccount = targetAccount;
    }
}
