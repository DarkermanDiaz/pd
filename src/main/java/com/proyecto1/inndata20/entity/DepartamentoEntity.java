package com.proyecto1.inndata20.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")

public class DepartamentoEntity {
    @Id //indica cual es la llave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_departamento")
    private Integer id;
    @Column (name = "m2")
    private Integer m2;
    @Column (name = "precio")
    private Double precio;

    public DepartamentoEntity() {}

    public DepartamentoEntity(Integer m2, Double precio, Integer id) {
        this.m2 = m2;
        this.precio = precio;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
