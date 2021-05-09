package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.AlumnoxFiltro;
import com.dagama.proeduca.entidades.Nivelestudio;
import com.dagama.proeduca.repositorio.NivelestudioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NivelestudioNegocioService {
    @Autowired
    private NivelestudioRepositorio nivelestudioRepositorio;

    public List<Nivelestudio> Nivelestudio(){
        List<Nivelestudio> listado = (List<Nivelestudio>)nivelestudioRepositorio.NivelEstudio();
        Nivelestudio nivelestudio = new Nivelestudio();
        for(Nivelestudio rep:listado){
            nivelestudio.setIdnivelestudio(rep.getIdnivelestudio());
            nivelestudio.setNombrenivelestudio(rep.getNombrenivelestudio());
        }
        return listado;
    }
}
