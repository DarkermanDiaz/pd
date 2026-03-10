package com.proyecto1.inndata20.service;

import com.proyecto1.inndata20.entity.DepartamentoEntity;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    public List<DepartamentoEntity> readAll();
    public Optional<DepartamentoEntity> readById(Integer id);
    public String create(DepartamentoEntity departamento); //Create
    public String updateById(Integer id, DepartamentoEntity departamento);
}
