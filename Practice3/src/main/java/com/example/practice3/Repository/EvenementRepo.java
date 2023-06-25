package com.example.practice3.Repository;

import com.example.practice3.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementRepo extends JpaRepository<Evenement, Integer> {
    Evenement findByDescription(String desc);
}
