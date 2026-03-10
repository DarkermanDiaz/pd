package com.proyecto1.inndata20.service.impl;

import com.proyecto1.inndata20.entity.PersonaEntity;
import com.proyecto1.inndata20.repository.PersonaRepository;
import com.proyecto1.inndata20.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PersonaService implements IPersonaService {
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<PersonaEntity> readAll() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<PersonaEntity> readById(Integer id) {
        return personaRepository.findById(id);
    }

    @Override
    public String create(PersonaEntity persona) {
        personaRepository.save(persona);
        return "Persona creada con exito";
    }

    @Override
    public String updateById(Integer id, PersonaEntity personaNueva) {
        Optional<PersonaEntity> personaBuscada = personaRepository.findById(id);
        if (personaBuscada.isPresent()) {
            PersonaEntity persona = personaBuscada.get();
            persona.setNombre(personaNueva.getNombre());
            persona.setEdad(personaNueva.getEdad());
            persona.setDireccion(personaNueva.getDireccion());
            persona.setIdDepartamento(personaNueva.getIdDepartamento());
            personaRepository.save(persona);
            return "Persona actualiza con exito";
        }else{
            return "Persona no encontrada";
        }
    }
}
