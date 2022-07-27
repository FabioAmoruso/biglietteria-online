package com.esame.biglietteriaonline.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "teatri")
public class Teatro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codTeatro;
    private String nome;
    private String indirizzo;
    private String citta;
    private String provincia;
    private String telefono;
    private int posti;

    @OneToOne(mappedBy = "teatro")
    private Spettacolo spettacolo;

}
