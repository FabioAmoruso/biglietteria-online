package com.esame.biglietteriaonline.controller;

import com.esame.biglietteriaonline.entities.Cliente;
import com.esame.biglietteriaonline.services.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cliente")
public class ClienteCtrl {

    @Autowired
    public BiglietteriaService service;

    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> getAllTickets(){
        List<Cliente> clienti = service.getAllClienti();
        return new ResponseEntity<List<Cliente>>(clienti, HttpStatus.OK);
    }

    @GetMapping("/{codCliente}")
    public ResponseEntity<Cliente> getOneClient(@PathVariable("codCliente") Long codCliente){
        Cliente cliente = service.findClienteByCodCliente(codCliente);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cliente> addClient(@RequestBody Cliente cliente){
        Cliente newCliente = service.addCliente(cliente);
        return new ResponseEntity<Cliente>(newCliente, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> updClient(@RequestBody Cliente cliente){
        Cliente updCliente = service.updCliente(cliente);
        return new ResponseEntity<Cliente>(updCliente, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codCliente}")
    public ResponseEntity<Cliente> deleteCliente(@PathVariable Long codCliente){
        service.deleteCliente(codCliente);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
