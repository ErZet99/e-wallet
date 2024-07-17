package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
public class Transaction {
    private Long id;
    private Wallet senderWallet;
    private Wallet receiverWallet;
    private Type type;
    private BigDecimal amount;
    private String description;
    private Instant date;
    private String referenceNumber;
    private Status status;
}
