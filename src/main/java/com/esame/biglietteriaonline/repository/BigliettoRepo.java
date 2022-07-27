package com.esame.biglietteriaonline.repository;

import com.esame.biglietteriaonline.entities.Biglietto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BigliettoRepo extends JpaRepository<Biglietto, String> {
    void deleteBigliettoByCodOperazione(String codOperazione);
    Biglietto findBigliettoByCodOperazione(String codOperazione);
}
