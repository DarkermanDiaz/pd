package com.proyecto1.inndata20.controller;

import com.proyecto1.inndata20.entity.DepartamentoEntity;
import com.proyecto1.inndata20.service.impl.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")

public class DepartamentoController {
    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/departamentos")
    public List<DepartamentoEntity> readAll() {
        return departamentoService.readAll();
    }

    @GetMapping("/departamento/{id}")
    public Optional<DepartamentoEntity> readById(@PathVariable Integer id) {
        return departamentoService.readById(id);
    }

    @PostMapping("/departamentos")
    public String create(@RequestBody DepartamentoEntity departamento) {
        return departamentoService.create(departamento);
    }

    @PutMapping("/departamento/{id}")
    public String update(@PathVariable Integer id, @RequestBody DepartamentoEntity departamento) {
        return departamentoService.updateById(id, departamento);
    }
}