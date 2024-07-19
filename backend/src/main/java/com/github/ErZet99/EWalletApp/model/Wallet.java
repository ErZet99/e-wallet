package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Wallet {
    @Id
    private Long id;

    @Column(length = 34, nullable = false, unique = true)
    private String iban;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal balance;


    private User user;
}
