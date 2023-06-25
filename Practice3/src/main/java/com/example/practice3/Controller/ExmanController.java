package com.example.practice3.Controller;

import com.example.practice3.Service.Iservice;
import com.example.practice3.entities.Evenement;
import com.example.practice3.entities.Logistique;
import com.example.practice3.entities.Participant;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/exam")
public class ExmanController {
    private  final Iservice service;
    @PostMapping("/addp")
    public Participant ajouterParticipant(@RequestBody Participant p){
        return service.ajouterParticipant(p);
    }
    @PostMapping("/adde")
    public Evenement ajoutAffectEvenParticip (@RequestBody Evenement e){
        return service.ajoutAffectEvenParticip(e);
    }
    @PostMapping("/addl/{desc}")
    public Logistique ajoutAffectLogEvnm (@RequestBody Logistique l ,@PathVariable String desc){
        return service.ajoutAffectLogEvnm(l,desc);
    }
    @GetMapping("/viewL/{dd}/{df}")
    public List<Logistique> getLogistiquesDates(@PathVariable  Date dd, @PathVariable  Date df){

        return service.getLogistiquesDates(dd,df);
    }

}
