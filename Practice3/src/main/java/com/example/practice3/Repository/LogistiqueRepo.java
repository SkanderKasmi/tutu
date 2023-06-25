package com.example.practice3.Repository;

import com.example.practice3.entities.Logistique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogistiqueRepo extends JpaRepository<Logistique,Integer> {
}
