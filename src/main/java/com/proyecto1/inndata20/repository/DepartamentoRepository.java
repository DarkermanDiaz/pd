package com.proyecto1.inndata20.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proyecto1.inndata20.entity.DepartamentoEntity;

public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity, Integer> {}