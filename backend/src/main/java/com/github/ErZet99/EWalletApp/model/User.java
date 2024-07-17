package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
}
