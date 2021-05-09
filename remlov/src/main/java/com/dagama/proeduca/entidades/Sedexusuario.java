package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sedexusuario {
    @Id
    private int idsede;
    private String nombresede;

    public Sedexusuario(){

    }

    public Sedexusuario(int idsede, String nombresede) {
        this.idsede = idsede;
        this.nombresede = nombresede;
    }

    public int getIdsede() {
        return idsede;
    }

    public void setIdsede(int idsede) {
        this.idsede = idsede;
    }

    public String getNombresede() {
        return nombresede;
    }

    public void setNombresede(String nombresede) {
        this.nombresede = nombresede;
    }
}
