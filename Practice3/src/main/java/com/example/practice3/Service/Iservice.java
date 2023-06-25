package com.example.practice3.Service;

import com.example.practice3.entities.Evenement;
import com.example.practice3.entities.Logistique;
import com.example.practice3.entities.Participant;

import java.util.Date;
import java.util.List;

public interface Iservice {
    public Participant ajouterParticipant(Participant p);
    public Evenement ajoutAffectEvenParticip (Evenement e);
    public Logistique ajoutAffectLogEvnm (Logistique l , String descriptionEnvmt);
    public List<Logistique> getLogistiquesDates(Date dateDeb , Date datefin);
    public  List<Participant> getParResvLogis();


}
