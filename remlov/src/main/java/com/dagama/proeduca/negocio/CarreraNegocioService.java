package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Carrera;
import com.dagama.proeduca.entidades.Seccion;
import com.dagama.proeduca.repositorio.CarreraRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarreraNegocioService {
    @Autowired
    private CarreraRepositorio carreraRepositorio;

    public List<Carrera> Carrera(int iduniversidad){
        List<Carrera> listado = (List<Carrera>)carreraRepositorio.Carrera(iduniversidad);
        Carrera carrera = new Carrera();
        for(Carrera rep:listado){
            carrera.setIdcarrera(rep.getIdcarrera());
            carrera.setNombrecarrera(rep.getNombrecarrera());
        }
        return listado;
    }
}
