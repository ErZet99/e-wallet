package com.github.ErZet99.EWalletApp.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@EqualsAndHashCode
public class Role {
    @Id
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, nullable = false, unique = true)
    private RoleType type;
}
