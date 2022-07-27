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
    @Column(name = "cod_spettacolo")
    private String codSpettacolo;
    private String titolo;
    private String autore;
    private String regista;
    private int prezzo;

    @ManyToOne
    @JoinColumn(name = "cod_teatro")
    private Teatro teatro;

    @ManyToMany(mappedBy = "spettacolo")
    private List<Replica> replica;
}
