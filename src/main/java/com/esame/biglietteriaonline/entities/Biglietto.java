package com.esame.biglietteriaonline.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "biglietti")
public class Biglietto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codOperazione;

    @ManyToOne
    @JoinColumn(name = "cod_cliente")
    private Cliente codCliente;

    @ManyToOne
    @JoinColumn(name = "cod_replica")
    private Replica codReplica;

    private LocalDateTime dataOra;
    private String tipoPagamento;
    private int quantita;

}
