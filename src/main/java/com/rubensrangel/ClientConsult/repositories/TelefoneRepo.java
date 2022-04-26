package com.rubensrangel.ClientConsult.repositories;

import com.rubensrangel.ClientConsult.domain.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepo extends JpaRepository<Telefone, Long> {
}
