package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Seccion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface SeccionRepositorio extends CrudRepository<Seccion, Long> {
    @Query(value="call ConsultaSeccion()", nativeQuery = true)
    public Iterable<Seccion> Seccion();
}
