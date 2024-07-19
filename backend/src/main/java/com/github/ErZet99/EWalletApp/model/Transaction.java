package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Transaction {
    @Id
    private Long id;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(length = 50)
    private String description;

    @Column(nullable = false)
    private Instant createdAt;

    @Column(nullable = false, unique = true)
    private UUID referenceNumber;

    @Column(length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;


    private Wallet fromWallet;
    private Wallet toWallet;
    private Type type;
}
