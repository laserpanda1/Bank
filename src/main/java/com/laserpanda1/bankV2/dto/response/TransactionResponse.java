package com.laserpanda1.bankV2.dto.response;

import com.laserpanda1.bankV2.pojo.BankAccount;
import com.laserpanda1.bankV2.pojo.TransactionStatus;
import com.laserpanda1.bankV2.pojo.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class TransactionResponse {

    private Long id;
    private BigDecimal amount;
    private String currency;
    private TransactionType type;
    private String description;
    private TransactionStatus status;

    // Информация о счетах (только ID и базовые данные)
    private AccountInfo sourceAccount;
    private AccountInfo targetAccount;

    // Для cash операций
    private String cashOperationCode;
    private String cashBranchCode;

    private LocalDateTime transactionDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Data
    @Builder
    public static class AccountInfo {
        private Long id;
        private String accountNumber;
        private String accountHolderName;
        private String bankName;

    }

}
