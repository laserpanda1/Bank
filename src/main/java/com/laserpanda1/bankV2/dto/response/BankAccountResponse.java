package com.laserpanda1.bankV2.dto.response;

import com.laserpanda1.bankV2.pojo.AccountType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
public class BankAccountResponse {

    private Long id;

    private String accountNumber;

    private BigDecimal balance = BigDecimal.ZERO;

    private AccountType accountType;

    private LocalDateTime createdAt;

    private String currency;

    private Long userId;
    private String userName;

    private Long bankId;
    private String bankName;

    private List<TransactionResponse> transaction = new ArrayList<>();



}
