package com.laserpanda1.bankV2.pojo;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String country;

    @NotNull
    private String city;

    private String rating;

    private String contactEmail;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BankAccount> accounts = new ArrayList<>();

    public Bank(String name, String country, String city, String rating) {
        this.name = name;
        this.country = country;
        this.city = city;
        this.rating = rating;
    }
}
