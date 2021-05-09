package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.AlumnoxFiltro;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AlumnoxFiltroRepositorio extends CrudRepository<AlumnoxFiltro, Long> {
    @Query(value="call ConsultaAlumnoxFiltro(:idsede, :idperiodo, :idnivelestudio, :idseccion)", nativeQuery = true)
    public Iterable<AlumnoxFiltro> AlumnoxFiltro(
            @Param("idsede") int idsede,
            @Param("idperiodo") int idperiodo,
            @Param("idnivelestudio") int idnivelestudio,
            @Param("idseccion") int idseccion);
}
