package com.laserpanda1.bankV2.dto.response;

import com.laserpanda1.bankV2.pojo.BankAccount;
import jakarta.persistence.CascadeType;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankResponse {

    private Long id;

    private String name;

    private String country;

    private String city;

    private String rating;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private List<BankAccountInfo> accounts = new ArrayList<>();

    @Data
    @Builder
    public static class BankAccountInfo {
        private Long id;
        private String accountNumber;
        private String currency;
        private BigDecimal balance;
        private String status;
    }
}
