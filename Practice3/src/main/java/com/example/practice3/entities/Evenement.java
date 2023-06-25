package com.example.practice3.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String description;
    Date dateDebut;
    Date dateFin;
    float cout;

    @ManyToMany(mappedBy = "evenementList",cascade = CascadeType.ALL)
    List<Participant> participantList;

    @OneToMany(cascade = CascadeType.ALL)
    List<Logistique> logistiques;
}
