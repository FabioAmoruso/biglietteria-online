package com.esame.biglietteriaonline.controller;

import com.esame.biglietteriaonline.entities.Replica;
import com.esame.biglietteriaonline.services.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/replica")
public class ReplicaCtrl {

    @Autowired
    public BiglietteriaService service;

    @GetMapping("/all")
    public ResponseEntity<List<Replica>> getAllReplica(){
        List<Replica> repliche = service.getAllRepliche();
        return new ResponseEntity<List<Replica>>(repliche, HttpStatus.OK);
    }

    @GetMapping("/{codReplica}")
    public ResponseEntity<Replica> getOneReplica(@PathVariable("codReplica") String codReplica){
        Replica replica = service.findReplicaByCodReplica(codReplica);
        return new ResponseEntity<Replica>(replica, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Replica> addReplica(@RequestBody Replica replica){
        Replica newReplica = service.addReplica(replica);
        return new ResponseEntity<Replica>(newReplica, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Replica> updReplica(@RequestBody Replica replica){
        Replica updReplica = service.updReplica(replica);
        return new ResponseEntity<Replica>(updReplica, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codReplica}")
    public ResponseEntity<Replica> deleteReplica(@PathVariable String codReplica){
        service.deleteReplica(codReplica);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
