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
    Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "cod_replica")
    Replica replica;

    private LocalDateTime dataOra;
    private String tipoPagamento;
    private int quantita;

}
