package com.example.practice3.entities;

import jdk.dynalink.linker.LinkerServices;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Logistique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idLog;
    String description;
    boolean reserve;
    float prixUnit;
    int quantite;

}
