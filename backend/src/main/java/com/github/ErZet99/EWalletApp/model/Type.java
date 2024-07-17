package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Type {
    private Long id;
    private String name;
    private String description;
}
