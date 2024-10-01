package com.example.demo.repositories;

import com.example.demo.domain.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


public interface personaRepository extends JpaRepository<Persona, Long> {
}
