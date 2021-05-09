package com.dagama.proeduca.rest;

import com.dagama.proeduca.entidades.*;
import com.dagama.proeduca.negocio.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:63342")
@RequestMapping("/api")
public class RemlovServiceRest {
    @Autowired
    private AlumnoxFiltroNegocioService alumnoxFiltroNegocioService;

    @Autowired
    private NivelestudioNegocioService nivelestudioNegocioService;

    @Autowired
    private ValidaUsuarioNegocioService validaUsuarioNegocioService;

    @Autowired
    private SedexUsuarioNegocioService sedeUsuarioNegocioService;

    @Autowired
    private SeccionNegocioService seccionNegocioService;

    @Autowired
    private UniversidadNegocioService universidadNegocioService;

    @Autowired
    private CarreraNegocioService carreraNegocioService;

    @GetMapping("/validausuario/{login}/{password}")
    public List<Validausuario> Validausuario(
            @PathVariable(value = "login") String login,
            @PathVariable(value = "password") String password){
        return validaUsuarioNegocioService.ValidaUsuario(login, password);
    }

    @GetMapping("/filtraralumno/{idsede}/{idperiodo}/{idnivelestudio}/{idseccion}")
    public List<AlumnoxFiltro> AlumnoxFiltro(
            @PathVariable(value = "idsede") int idsede,
            @PathVariable(value = "idperiodo") int idperiodo,
            @PathVariable(value = "idnivelestudio") int idnivelestudio,
            @PathVariable(value = "idseccion") int idseccion){
        return alumnoxFiltroNegocioService.AlumnoxFiltro(idsede, idperiodo, idnivelestudio, idseccion);
    }

    @GetMapping("/nivelestudio/")
    public List<Nivelestudio> NivelEstudio(){
        return nivelestudioNegocioService.Nivelestudio();
    }

    @GetMapping("/seccion/")
    public List<Seccion> Seccion(){
        return seccionNegocioService.Seccion();
    }

    @GetMapping("/sedexusuario/{idusuario}")
    public List<Sedexusuario> SedeUsuario(
            @PathVariable(value = "idusuario") int idusuario){
        return sedeUsuarioNegocioService.Sedeusuario(idusuario);
    }

    @GetMapping("/universidad/")
    public List<Universidad> Universidad(){
        return universidadNegocioService.Universidad();
    }

    @GetMapping("/carreraxuniversidad/{iduniversidad}")
    public List<Carrera> Carrera(
            @PathVariable(value = "iduniversidad") int iduniversidad
    ){
        return carreraNegocioService.Carrera(iduniversidad);
    }
}
