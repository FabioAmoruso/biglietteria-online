package com.esame.biglietteriaonline.controller;

import com.esame.biglietteriaonline.entities.Teatro;
import com.esame.biglietteriaonline.services.BiglietteriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/teatro")
public class TeatroCtrl {

    @Autowired
    private BiglietteriaService service;

    @GetMapping("/all")
    public ResponseEntity<List<Teatro>> getAllTheater(){
        List<Teatro> teatri = service.getAllTeatri();
        return new ResponseEntity<>(teatri, HttpStatus.OK);
    }

    @GetMapping("/{codTeatro}")
    public ResponseEntity<Teatro> getOneTheatre(@PathVariable("codTeatro") String codTeatro){
        Teatro teatro = service.findTeatroByCodTeatro(codTeatro);
        return new ResponseEntity<Teatro>(teatro, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Teatro> addTheater(@RequestBody Teatro teatro){
        Teatro newTeatro = service.addTeatro(teatro);
        return new ResponseEntity<Teatro>(newTeatro, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Teatro> updTheatre(@RequestBody Teatro teatro){
        Teatro updTeatro = service.updTeatro(teatro);
        return new ResponseEntity<Teatro>(updTeatro, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{codTeatro}")
    public ResponseEntity<Teatro> deleteTheatre(@PathVariable String codTeatro){
        service.deleteTeatro(codTeatro);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
