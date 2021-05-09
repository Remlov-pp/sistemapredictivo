package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Sedexusuario;
import com.dagama.proeduca.repositorio.SedexusuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedexUsuarioNegocioService {
    @Autowired
    private SedexusuarioRepositorio sedeusuarioRepositorio;

    public List<Sedexusuario> Sedeusuario(int idusuario){
        List<Sedexusuario> listado = (List<Sedexusuario>)sedeusuarioRepositorio.SedeUsuario(idusuario);
        Sedexusuario sedeusuario = new Sedexusuario();
        for(Sedexusuario rep:listado){
            sedeusuario.setIdsede(rep.getIdsede());
            sedeusuario.setNombresede(rep.getNombresede());
        }
        return listado;
    }
}
