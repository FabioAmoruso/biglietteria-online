package com.esame.biglietteriaonline.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "spettacoli")
public class Spettacolo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codSpettacolo;
    private String titolo;
    private String autore;
    private String regista;
    private int prezzo;

    @OneToOne
    @MapsId
    @JoinColumn(name = "cod_teatro", referencedColumnName = "cod_teatro")
    private Teatro teatro;

    @OneToOne(mappedBy = "spettacolo")
    private Replica replica;

}
