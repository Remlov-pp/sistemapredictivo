package com.dagama.proeduca.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AlumnoxFiltro {
    @Id
    private Long idalumno;
    private String paterno;
    private String materno;
    private String nombres;
    private String nombrenivelestudio;
    private String nombreseccion;

    public AlumnoxFiltro() {

    }

    public AlumnoxFiltro(Long idalumno, String paterno, String materno, String nombres, String nivelestudio, String seccion) {
        this.idalumno = idalumno;
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
        this.nombrenivelestudio = nombrenivelestudio;
        this.nombreseccion = nombreseccion;
    }

    public Long getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Long idalumno) {
        this.idalumno = idalumno;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getNombrenivelestudio() {
        return nombrenivelestudio;
    }

    public void setNombrenivelestudio(String nombrenivelestudio) {
        this.nombrenivelestudio = nombrenivelestudio;
    }

    public String getNombreseccion() {
        return nombreseccion;
    }

    public void setNombreseccion(String nombreseccion) {
        this.nombreseccion = nombreseccion;
    }
}
