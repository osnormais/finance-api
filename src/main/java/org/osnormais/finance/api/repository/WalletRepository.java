package org.osnormais.finance.api.repository;

import org.osnormais.finance.api.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
} 
