package com.esame.biglietteriaonline.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clienti")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codCliente;
    private String cognome;
    private String nome;
    private String telefono;
    private String email;

    @OneToMany(mappedBy = "cliente")
    List<Biglietto> biglietti;
}
