package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Validausuario {
    @Id
    private int idusuario;
    private int idtipo;
    private String nombreusuario;

    public Validausuario(){

    }

    public Validausuario(int idusuario, int idtipo, String nombreusuario) {
        this.idusuario = idusuario;
        this.idtipo = idtipo;
        this.nombreusuario = nombreusuario;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdtipo() {
        return idtipo;
    }

    public void setIdtipo(int idtipo) {
        this.idtipo = idtipo;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }
}
