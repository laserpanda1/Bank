package com.laserpanda1.bankV2.pojo;

public enum TransactionType {
    DEPOSIT("Пополнение"),
    WITHDRAWAL("Снятие"),
    TRANSFER("Перевод"),
    PAYMENT("Платеж");

    private final String description;

    TransactionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
