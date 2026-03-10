package com.proyecto1.inndata20.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "persona")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_persona")
    private Integer id;
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "direccion")
    private String direccion;
    @Column (name = "edad")
    private Integer edad;
    @Column (name = "id_departamento")
    private Integer idDepartamento;
}
