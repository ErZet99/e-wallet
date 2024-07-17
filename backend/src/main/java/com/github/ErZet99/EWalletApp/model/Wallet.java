package com.github.ErZet99.EWalletApp.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Wallet {
    private Long id;
    private String name;
    private BigDecimal balance;
    private User user;
}
