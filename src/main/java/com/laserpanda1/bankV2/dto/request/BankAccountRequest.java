package com.laserpanda1.bankV2.dto.request;

import com.laserpanda1.bankV2.pojo.AccountType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountRequest {

    @NotBlank(message="Not blank field")
    private String accountNumber;

    @NotNull(message="accountType is required")
    private AccountType accountType;

    @NotBlank(message="Not blank field")
    private String currency;

    @NotNull(message="userID is required")
    private Long userId;

    @NotNull(message="bankId is required")
    private Long bankId;

}
