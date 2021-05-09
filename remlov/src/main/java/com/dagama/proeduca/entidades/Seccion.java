package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seccion {
    @Id
    private Long idseccion;
    private String nombreseccion;

    public Seccion(){

    }

    public Seccion(Long idseccion, String nombreseccion) {
        this.idseccion = idseccion;
        this.nombreseccion = nombreseccion;
    }

    public Long getIdseccion() {
        return idseccion;
    }

    public void setIdseccion(Long idseccion) {
        this.idseccion = idseccion;
    }

    public String getNombreseccion() {
        return nombreseccion;
    }

    public void setNombreseccion(String nombreseccion) {
        this.nombreseccion = nombreseccion;
    }
}
