package com.proyecto1.inndata20.repository;

import com.proyecto1.inndata20.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, Integer> {}