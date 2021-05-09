package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Universidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UniversidadRepositorio extends CrudRepository<Universidad, Long> {
    @Query(value="call ConsultaUniversidad()", nativeQuery = true)
    public Iterable<Universidad> Universidad();
}
