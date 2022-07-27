package com.esame.biglietteriaonline.repository;

import com.esame.biglietteriaonline.entities.Replica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplicaRepo extends JpaRepository<Replica, String> {
    void deleteReplicaByCodReplica(String codReplica);
    Replica findReplicaByCodReplica(String codReplica);
}
