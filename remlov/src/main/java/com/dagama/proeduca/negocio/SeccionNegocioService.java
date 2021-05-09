package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Seccion;
import com.dagama.proeduca.repositorio.SeccionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeccionNegocioService {
    @Autowired
    private SeccionRepositorio seccionRepositorio;

    public List<Seccion> Seccion(){
        List<Seccion> listado = (List<Seccion>)seccionRepositorio.Seccion();
        Seccion seccion = new Seccion();
        for(Seccion rep:listado){
            seccion.setIdseccion(rep.getIdseccion());
            seccion.setNombreseccion(rep.getNombreseccion());
        }
        return listado;
    }
}
