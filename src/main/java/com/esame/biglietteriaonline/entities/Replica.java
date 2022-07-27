package com.esame.biglietteriaonline.entities;

import lombok.*;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "repliche")
public class Replica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_replica")
    private String codRepliche;
    private SimpleDateFormat data;

    @ManyToMany
    @JoinColumn(name = "cod_spettacolo")
    private List<Spettacolo> spettacolo;

    @OneToOne(mappedBy = "replica")
    private Biglietto biglietto;
}
