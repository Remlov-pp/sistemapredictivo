package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universidadcarrera {
    @Id
    private Long iduniversidacarrera;
    private int iduniversidad;
    private int idcarrera;
    private int esactivo;

    public Universidadcarrera(){

    }

    public Universidadcarrera(Long iduniversidacarrera, int iduniversidad, int idcarrera, int esactivo) {
        this.iduniversidacarrera = iduniversidacarrera;
        this.iduniversidad = iduniversidad;
        this.idcarrera = idcarrera;
        this.esactivo = esactivo;
    }

    public Long getIduniversidacarrera() {
        return iduniversidacarrera;
    }

    public void setIduniversidacarrera(Long iduniversidacarrera) {
        this.iduniversidacarrera = iduniversidacarrera;
    }

    public int getIduniversidad() {
        return iduniversidad;
    }

    public void setIduniversidad(int iduniversidad) {
        this.iduniversidad = iduniversidad;
    }

    public int getIdcarrera() {
        return idcarrera;
    }

    public void setIdcarrera(int idcarrera) {
        this.idcarrera = idcarrera;
    }

    public int getEsactivo() {
        return esactivo;
    }

    public void setEsactivo(int esactivo) {
        this.esactivo = esactivo;
    }
}
