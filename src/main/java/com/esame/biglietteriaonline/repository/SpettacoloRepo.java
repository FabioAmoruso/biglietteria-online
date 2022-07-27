package com.esame.biglietteriaonline.repository;

import com.esame.biglietteriaonline.entities.Spettacolo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpettacoloRepo extends JpaRepository<Spettacolo, String> {
    void deleteSpettacoloByCodSpettacolo(String codSpettacolo);
    Spettacolo findSpettacoloByCodSpettacolo(String codSpettacolo);

}
