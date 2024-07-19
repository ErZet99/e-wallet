package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    @Id
    private Long id;

    @Column(length = 50, nullable = false)
    private String firstName;

    @Column(length = 50, nullable = false)
    private String lastName;

    @Column(length = 20, nullable = false, unique = true)
    private String userName;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 50, nullable = false, unique = true)
    private String email;
}
