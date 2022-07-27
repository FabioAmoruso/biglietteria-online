package com.esame.biglietteriaonline.presentation;

import com.esame.biglietteriaonline.repository.SpettacoloRepo;
import com.esame.biglietteriaonline.repository.TeatroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BiglietteriaPres {

    @Autowired
    private SpettacoloRepo spettacoloRepo;
    @Autowired
    private TeatroRepo teatroRepo;

    @GetMapping("/spettacoli")
    public String getSpettacoli(Model model){
        model.addAttribute("spettacoli", spettacoloRepo.findAll());
        model.addAttribute("teatri", teatroRepo.findAll());
        return "spettacoli";
    }
}
