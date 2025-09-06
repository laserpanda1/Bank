package com.laserpanda1.bankV2.pojo;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @NotNull(message = "Email is required")
    private String email;

    @NotNull(message = "min: 5 , max:30 ")
    @Size(min=2, max=30)
    private String name;

    @NotNull(message = "min: 2, max:30 ")
    @Size(min=2, max=30)
    private String surname;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BankAccount> accounts = new ArrayList<>();

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
}
