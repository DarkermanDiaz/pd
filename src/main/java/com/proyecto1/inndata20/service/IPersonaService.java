package com.proyecto1.inndata20.service;

import com.proyecto1.inndata20.entity.PersonaEntity;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<PersonaEntity> readAll();
    public Optional<PersonaEntity> readById(Integer id);
    public String create(PersonaEntity persona);
    public String updateById(Integer id, PersonaEntity persona);
}
