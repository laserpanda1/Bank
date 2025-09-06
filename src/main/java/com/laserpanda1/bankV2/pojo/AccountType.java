package com.laserpanda1.bankV2.pojo;

import lombok.Data;

public enum AccountType {
    DEBIT("Дебетовый"),
    CREDIT("Кредитовый"),
    SAVINGS("Сберегательный"),
    CURRENT("Текущий");

    private final String description;

    AccountType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
