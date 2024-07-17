package com.github.ErZet99.EWalletApp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    PENDING("Pending"),
    SUCCESS("Success"),
    ERROR("Error");

    private String label;
}
