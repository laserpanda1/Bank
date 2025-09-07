package com.laserpanda1.bankV2.dto.request;

import com.laserpanda1.bankV2.pojo.TransactionType;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;

public class TransactionRequest {

    @NotNull(message = "Amount is required")
    @DecimalMin(value = "0.01", message = "Amount must be greater than 0")
    @Digits(integer = 15, fraction = 2, message = "Amount must have up to 15 digits and 2 decimals")
    private BigDecimal amount;

    @NotBlank(message = "Currency is required")
    @Size(min = 3, max = 3, message = "Currency must be 3 characters ISO code")
    private String currency;

    @NotNull(message = "Transaction type is required")
    private TransactionType type;

    @Size(max = 255, message = "Description too long")
    private String description;

    @NotNull(message = "Source account ID is required")
    @Positive(message = "Source account ID must be positive")
    private Long sourceAccountId;

    // Для переводов между счетами
    @Positive(message = "Target account ID must be positive")
    private Long targetAccountId;

    // Для депозитов/снятий наличных
    @Size(max = 50, message = "Cash operation code too long")
    private String cashOperationCode;

    // Валидация в зависимости от типа операции
    @AssertTrue(message = "For TRANSFER, target account is required")
    public boolean isTransferValid() {
        return type != TransactionType.TRANSFER || targetAccountId != null;
    }

    @AssertTrue(message = "For CASH operations, cash operation code is required")
    public boolean isCashOperationValid() {
        return type != TransactionType.DEPOSIT &&
                type != TransactionType.WITHDRAWAL ||
                cashOperationCode != null;
    }
}
