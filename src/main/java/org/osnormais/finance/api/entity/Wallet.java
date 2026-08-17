package org.osnormais.finance.api.entity;

import java.time.Instant;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "wallets")
public class Wallet {

    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id;
    private String name;
    private String description;
    private Instant createdAt; 

}
