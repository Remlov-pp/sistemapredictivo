package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Seccion;
import com.dagama.proeduca.entidades.Universidad;
import com.dagama.proeduca.repositorio.UniversidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversidadNegocioService {
    @Autowired
    private UniversidadRepositorio universidadRepositorio;

    public List<Universidad> Universidad(){
        List<Universidad> listado = (List<Universidad>)universidadRepositorio.Universidad();
        Universidad universidad = new Universidad();
        for(Universidad rep:listado){
            universidad.setIduniversidad(rep.getIduniversidad());
            universidad.setNombreuniversidad(rep.getNombreuniversidad());
        }
        return listado;
    }
}
