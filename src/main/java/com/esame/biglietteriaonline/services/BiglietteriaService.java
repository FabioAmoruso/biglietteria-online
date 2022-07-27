package com.esame.biglietteriaonline.services;

import com.esame.biglietteriaonline.entities.*;

import java.util.List;

public interface BiglietteriaService {

    List<Biglietto> getAllBiglietti();
    List<Cliente> getAllClienti();
    List<Replica> getAllRepliche();
    List<Spettacolo> getAllSpettacoli();
    List<Teatro> getAllTeatri();

    Biglietto addBiglietto(Biglietto biglietto);
    Cliente addCliente(Cliente cliente);
    Replica addReplica(Replica replica);
    Spettacolo addSpettacolo(Spettacolo spettacolo);
    Teatro addTeatro(Teatro teatro);

    Biglietto updBiglietto(Biglietto biglietto);
    Cliente updCliente(Cliente cliente);
    Replica updReplica(Replica replica);
    Spettacolo updSpettacolo(Spettacolo spettacolo);
    Teatro updTeatro(Teatro teatro);

    void deleteBiglietto(String codOperazione);
    void deleteCliente(Long codCliente);
    void deleteReplica(String codReplica);
    void deleteSpettacolo(String codSpettacolo);
    void deleteTeatro(String codTeatro);

    Biglietto findBigliettoByCodOperazione(String codOperazione);
    Cliente findClienteByCodCliente(Long codCliente);
    Replica findReplicaByCodReplica(String codReplica);
    Spettacolo findSpettacoloByCodSpettacolo(String codSpettacolo);
    Teatro findTeatroByCodTeatro(String codTeatro);

}
