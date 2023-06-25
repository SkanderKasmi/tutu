package com.example.practice3.Repository;

import com.example.practice3.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticapantRepo extends JpaRepository<Participant, Integer> {
}
