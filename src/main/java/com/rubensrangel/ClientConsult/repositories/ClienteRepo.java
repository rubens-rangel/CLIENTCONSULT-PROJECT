package com.rubensrangel.ClientConsult.repositories;

import com.rubensrangel.ClientConsult.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
}
