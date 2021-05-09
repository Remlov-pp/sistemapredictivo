package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nivelestudio {
    @Id
    private Long idnivelestudio;
    private String nombrenivelestudio;

    public Nivelestudio(){

    }

    public Nivelestudio(Long idnivelestudio, String nombrenivelestudio) {
        this.idnivelestudio = idnivelestudio;
        this.nombrenivelestudio = nombrenivelestudio;
    }

    public Long getIdnivelestudio() {
        return idnivelestudio;
    }

    public void setIdnivelestudio(Long idnivelestudio) {
        this.idnivelestudio = idnivelestudio;
    }

    public String getNombrenivelestudio() {
        return nombrenivelestudio;
    }

    public void setNombrenivelestudio(String nombrenivelestudio) {
        this.nombrenivelestudio = nombrenivelestudio;
    }
}
