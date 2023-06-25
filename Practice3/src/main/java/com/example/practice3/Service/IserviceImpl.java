package com.example.practice3.Service;

import com.example.practice3.Repository.EvenementRepo;
import com.example.practice3.Repository.LogistiqueRepo;
import com.example.practice3.Repository.ParticapantRepo;
import com.example.practice3.entities.Evenement;
import com.example.practice3.entities.Logistique;
import com.example.practice3.entities.Participant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service

public class IserviceImpl implements  Iservice{
    @Autowired
    EvenementRepo evenementRepo;
    @Autowired
    LogistiqueRepo logistiqueRepo;
    @Autowired
    ParticapantRepo particapantRepo;


    @Override
    public Participant ajouterParticipant(Participant p) {
        return particapantRepo.save(p);
    }
    @Transactional
    @Override
    public Evenement ajoutAffectEvenParticip(Evenement e) {
        Participant p1 = particapantRepo.findById(1).orElse(null);
        Participant p2 = particapantRepo.findById(2).orElse(null);
        Participant p3 = particapantRepo.findById(3).orElse(null);
        Participant p4 = particapantRepo.findById(4).orElse(null);
        System.out.println(p1.getNom());
        System.out.println(p2.getNom());
        System.out.println(p3.getNom());
        System.out.println(p4.getNom());
       p1.getEvenementList().add(e);
       p2.getEvenementList().add(e);
       p3.getEvenementList().add(e);
       /*p4.getEvenementList().add(e);*/
       System.out.println(p1.getNom());
        return evenementRepo.saveAndFlush(e) ;
    }
    @Transactional
    @Override
    public Logistique ajoutAffectLogEvnm(Logistique l, String descriptionEnvmt) {
        Evenement e = evenementRepo.findByDescription(descriptionEnvmt);
        System.out.println(e.getDescription());
        e.getLogistiques().add(l);
        return logistiqueRepo.saveAndFlush(l);
    }

    @Override
    public List<Logistique> getLogistiquesDates(Date dateDeb, Date datefin) {
        List<Logistique> pfinal = null;
        List<Evenement> e = evenementRepo.findAll();
       e.stream().filter(evenement -> evenement.getDateDebut().before(dateDeb)&&dateDeb.before(evenement.getDateFin())).collect().toString()

        return pfinal;
    }

    @Override
    public List<Participant> getParResvLogis() {
        return null;
    }
}
