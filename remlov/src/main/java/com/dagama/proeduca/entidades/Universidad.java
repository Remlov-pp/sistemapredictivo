package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Universidad {
    @Id
    private Long iduniversidad;
    private String nombreuniversidad;
    private String nombrecorto;
    private int tipouniversidad;
    private int esactivo;

    public Universidad(){

    }

    public Universidad(Long iduniversidad, String nombreuniversidad, String nombrecorto, int tipouniversidad, int esactivo) {
        this.iduniversidad = iduniversidad;
        this.nombreuniversidad = nombreuniversidad;
        this.nombrecorto = nombrecorto;
        this.tipouniversidad = tipouniversidad;
        this.esactivo = esactivo;
    }

    public Long getIduniversidad() {
        return iduniversidad;
    }

    public void setIduniversidad(Long iduniversidad) {
        this.iduniversidad = iduniversidad;
    }

    public String getNombreuniversidad() {
        return nombreuniversidad;
    }

    public void setNombreuniversidad(String nombreuniversidad) {
        this.nombreuniversidad = nombreuniversidad;
    }

    public String getNombrecorto() {
        return nombrecorto;
    }

    public void setNombrecorto(String nombrecorto) {
        this.nombrecorto = nombrecorto;
    }

    public int getTipouniversidad() {
        return tipouniversidad;
    }

    public void setTipouniversidad(int tipouniversidad) {
        this.tipouniversidad = tipouniversidad;
    }

    public int getEsactivo() {
        return esactivo;
    }

    public void setEsactivo(int esactivo) {
        this.esactivo = esactivo;
    }
}
