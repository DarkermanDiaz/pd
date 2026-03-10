package com.proyecto1.inndata20.controller;

import com.proyecto1.inndata20.entity.PersonaEntity;
import com.proyecto1.inndata20.service.impl.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")

public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/personas")
    public List<PersonaEntity> readAll() {
        return personaService.readAll();
    }

    @GetMapping("/persona/{id}")
    public Optional<PersonaEntity> readById(@PathVariable Integer id) {
        return personaService.readById(id);
    }

    @PostMapping("/personas")
    public String create(@RequestBody PersonaEntity persona) {
        return personaService.create(persona);
    }

    @PutMapping("/persona/{id}")
    public String update(@PathVariable Integer id, @RequestBody PersonaEntity persona) {
        return personaService.updateById(id, persona);
    }
}
