package com.esame.biglietteriaonline.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
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
    private String codReplica;
    private Date dataReplica;

    @OneToMany(mappedBy = "replica")
    List<Biglietto> biglietti;

    @OneToOne
    @MapsId
    @JoinColumn(name = "cod_spettacolo", referencedColumnName = "cod_spettacolo")
    private Spettacolo spettacolo;
}
