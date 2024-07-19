package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Type {
    @Id
    private Long id;

    @Column(length = 50, nullable = false, unique = true)
    private String name;

    @Column(length = 50)
    private String description;
}
