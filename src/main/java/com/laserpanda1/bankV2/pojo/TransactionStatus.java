package com.laserpanda1.bankV2.pojo;

public enum TransactionStatus {
    VERIFY("Подтверждено"),
    DENY("Отклонено");

    private final String description;

    TransactionStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
