package com.laserpanda1.bankV2.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;

    private BigDecimal balance = BigDecimal.ZERO;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    private LocalDateTime createdAt;

    private String currency;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bank_id", nullable = false)
    private Bank bank;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

    public BankAccount(String accountNumber, String currency, User user,
                       Bank bank)
    {
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.user = user;
        this.bank = bank;
        this.createdAt = LocalDateTime.now();
    }
}
