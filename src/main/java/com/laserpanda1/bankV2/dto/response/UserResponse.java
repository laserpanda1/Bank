package com.laserpanda1.bankV2.dto.response;

import com.laserpanda1.bankV2.pojo.BankAccount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {
    private String name;
    private String surname;
    private String email;
    private List<BankAccount> accounts = new ArrayList<>();
}
