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

//    @OneToMany(mappedBy = "replica")
//    List<Biglietto> biglietti;

    @ManyToOne
    @JoinColumn(name = "cod_spettacolo")
    private Spettacolo spettacolo;
}
