package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Nivelestudio;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface NivelestudioRepositorio extends CrudRepository<Nivelestudio, Long> {
    @Query(value="call ConsultaNivelEstudio()", nativeQuery = true)
    public Iterable<Nivelestudio> NivelEstudio();
}
