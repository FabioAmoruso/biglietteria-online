package com.esame.biglietteriaonline.repository;

import com.esame.biglietteriaonline.entities.Teatro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeatroRepo extends JpaRepository<Teatro, String> {
    void deleteTeatroByCodTeatro(String codTeatro);
    Teatro findTeatroByCodTeatro(String codTeatro);
}
