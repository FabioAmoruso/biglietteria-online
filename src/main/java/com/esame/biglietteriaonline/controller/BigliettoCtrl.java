package com.esame.biglietteriaonline.controller;

import com.esame.biglietteriaonline.entities.Biglietto;
import com.esame.biglietteriaonline.services.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/biglietto")
public class BigliettoCtrl {

    @Autowired
    public BiglietteriaService service;

    @GetMapping("/all")
    public ResponseEntity<List<Biglietto>> getAllTickets(){
        List<Biglietto> biglietti = service.getAllBiglietti();
        return new ResponseEntity<List<Biglietto>>(biglietti, HttpStatus.OK);
    }

    @GetMapping("/{codOperazione}")
    public ResponseEntity<Biglietto> getOneTicket(@PathVariable("codOperazione") String codOperazione){
        Biglietto biglietto = service.findBigliettoByCodOperazione(codOperazione);
        return new ResponseEntity<Biglietto>(biglietto, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Biglietto> addTicket(@RequestBody Biglietto biglietto){
        Biglietto newBiglietto = service.addBiglietto(biglietto);
        return new ResponseEntity<Biglietto>(newBiglietto, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Biglietto> updTicket(@RequestBody Biglietto biglietto){
        Biglietto updBiglietto = service.updBiglietto(biglietto);
        return new ResponseEntity<Biglietto>(updBiglietto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codOperazione}")
    public ResponseEntity<Biglietto> deleteTicket(@PathVariable String codOperazione){
        service.deleteBiglietto(codOperazione);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
