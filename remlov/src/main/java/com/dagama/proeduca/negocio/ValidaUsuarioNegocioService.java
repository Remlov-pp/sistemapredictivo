package com.dagama.proeduca.negocio;

import com.dagama.proeduca.entidades.Validausuario;
import com.dagama.proeduca.repositorio.ValidausuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ValidaUsuarioNegocioService {
    @Autowired
    private ValidausuarioRepositorio validaUsuarioRepositorio;

    public List<Validausuario> ValidaUsuario(String login, String password){
        List<Validausuario> listado = (List<Validausuario>)validaUsuarioRepositorio.ValidaUsuario(login, password);
        Validausuario validausuario = new Validausuario();
        for(Validausuario rep:listado){
            validausuario.setIdusuario(rep.getIdusuario());
            validausuario.setIdtipo(rep.getIdtipo());
            validausuario.setNombreusuario(rep.getNombreusuario());
        }
        return listado;
    }
}
