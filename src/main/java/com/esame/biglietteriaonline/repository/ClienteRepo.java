package com.esame.biglietteriaonline.repository;

import com.esame.biglietteriaonline.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
    void deleteClienteByCodCliente(Long codCliente);
    Cliente findClienteByCodCliente(Long codCliente);
}
