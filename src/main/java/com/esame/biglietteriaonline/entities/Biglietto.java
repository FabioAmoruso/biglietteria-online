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
    @Column(name = "cod_operazione")
    private String codOperazione;

    @ManyToMany
    @JoinColumn(name = "cod_cliente")
    private List<Cliente> cliente;

    @OneToOne
    @JoinColumn(name = "cod_replica")
    private Replica replica;

    private LocalDateTime data_ora;
    private String tipoPagamento;
    private int quantita;
}
