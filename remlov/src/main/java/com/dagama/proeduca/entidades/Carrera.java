package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Carrera {
    @Id
    private Long idcarrera;
    private String nombrecarrera;
    private String nombrecorto;
    private int esactivo;

    public Carrera(){

    }

    public Carrera(Long idcarrera, String nombrecarrera, String nombrecorto, int esactivo) {
        this.idcarrera = idcarrera;
        this.nombrecarrera = nombrecarrera;
        this.nombrecorto = nombrecorto;
        this.esactivo = esactivo;
    }

    public Long getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(Long idcarrera) {
        this.idcarrera = idcarrera;
    }

    public String getNombrecarrera() {
        return nombrecarrera;
    }

    public void setNombrecarrera(String nombrecarrera) {
        this.nombrecarrera = nombrecarrera;
    }

    public String getNombrecorto() {
        return nombrecorto;
    }

    public void setNombrecorto(String nombrecorto) {
        this.nombrecorto = nombrecorto;
    }

    public int getEsactivo() {
        return esactivo;
    }

    public void setEsactivo(int esactivo) {
        this.esactivo = esactivo;
    }
}
