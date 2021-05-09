package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.AlumnoxFiltro;
import com.dagama.proeduca.repositorio.AlumnoxFiltroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoxFiltroNegocioService {
    @Autowired
    private AlumnoxFiltroRepositorio alumnoxFiltroRepositorio;

    public List<AlumnoxFiltro> AlumnoxFiltro(int idsede, int idperiodo, int idnivelestudio,
                                             int idseccion){
        List<AlumnoxFiltro> listado = (List<AlumnoxFiltro>)alumnoxFiltroRepositorio.AlumnoxFiltro(idsede, idperiodo, idnivelestudio, idseccion);
        AlumnoxFiltro alumnoxfiltro = new AlumnoxFiltro();
        for(AlumnoxFiltro rep:listado){
            alumnoxfiltro.setIdalumno(rep.getIdalumno());
            alumnoxfiltro.setPaterno(rep.getPaterno());
            alumnoxfiltro.setNombres(rep.getNombres());
            alumnoxfiltro.setNombrenivelestudio(rep.getNombrenivelestudio());
            alumnoxfiltro.setNombreseccion(rep.getNombreseccion());
        }
        return listado;
    }
}
