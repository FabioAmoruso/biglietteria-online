package com.esame.biglietteriaonline.services;

import com.esame.biglietteriaonline.entities.*;
import com.esame.biglietteriaonline.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BiglietteriaServiceImpl implements BiglietteriaService {

    @Autowired
    private BigliettoRepo bigliettoRepo;
    @Autowired
    private ClienteRepo clienteRepo;
    @Autowired
    private ReplicaRepo replicaRepo;
    @Autowired
    private SpettacoloRepo spettacoloRepo;
    @Autowired
    private TeatroRepo teatroRepo;


    @Override
    public List<Biglietto> getAllBiglietti() {
        return bigliettoRepo.findAll();
    }

    @Override
    public List<Cliente> getAllClienti() {
        return clienteRepo.findAll();
    }

    @Override
    public List<Replica> getAllRepliche() {
        return replicaRepo.findAll();
    }

    @Override
    public List<Spettacolo> getAllSpettacoli() {
        return spettacoloRepo.findAll();
    }

    @Override
    public List<Teatro> getAllTeatri() {
        return teatroRepo.findAll();
    }

    @Override
    public Biglietto addBiglietto(Biglietto biglietto) {
        return bigliettoRepo.save(biglietto);
    }

    @Override
    public Cliente addCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Replica addReplica(Replica replica) {
        return replicaRepo.save(replica);
    }

    @Override
    public Spettacolo addSpettacolo(Spettacolo spettacolo) {
        return spettacoloRepo.save(spettacolo);
    }

    @Override
    public Teatro addTeatro(Teatro teatro) {
        return teatroRepo.save(teatro);
    }

    @Override
    public Biglietto updBiglietto(Biglietto biglietto) {
        return bigliettoRepo.save(biglietto);
    }

    @Override
    public Cliente updCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public Replica updReplica(Replica replica) {
        return replicaRepo.save(replica);
    }

    @Override
    public Spettacolo updSpettacolo(Spettacolo spettacolo) {
        return spettacoloRepo.save(spettacolo);
    }

    @Override
    public Teatro updTeatro(Teatro teatro) {
        return teatroRepo.save(teatro);
    }

    @Override
    public void deleteBiglietto(String codOperazione) {
        bigliettoRepo.deleteBigliettoByCodOperazione(codOperazione);
    }

    @Override
    public void deleteCliente(Long codCliente) {
        clienteRepo.deleteClienteByCodCliente(codCliente);
    }

    @Override
    public void deleteReplica(String codReplica) {
        replicaRepo.deleteReplicaByCodReplica(codReplica);
    }

    @Override
    public void deleteSpettacolo(String codSpettacolo) {
        spettacoloRepo.deleteSpettacoloByCodSpettacolo(codSpettacolo);
    }

    @Override
    public void deleteTeatro(String codTeatro) {
        teatroRepo.deleteTeatroByCodTeatro(codTeatro);
    }

    @Override
    public Biglietto findBigliettoByCodOperazione(String codOperazione) {
        return bigliettoRepo.findBigliettoByCodOperazione(codOperazione);
    }

    @Override
    public Cliente findClienteByCodCliente(Long codCliente) {
        return clienteRepo.findClienteByCodCliente(codCliente);
    }

    @Override
    public Replica findReplicaByCodReplica(String codReplica) {
        return replicaRepo.findReplicaByCodReplica(codReplica);
    }

    @Override
    public Spettacolo findSpettacoloByCodSpettacolo(String codSpettacolo) {
        return spettacoloRepo.findSpettacoloByCodSpettacolo(codSpettacolo);
    }

    @Override
    public Teatro findTeatroByCodTeatro(String codTeatro) {
        return teatroRepo.findTeatroByCodTeatro(codTeatro);
    }
}
