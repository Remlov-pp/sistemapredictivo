package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Carrera;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CarreraRepositorio extends CrudRepository<Carrera, Long> {
    @Query(value="call ConsultaCarreraxUniversidad(:iduniversidad)", nativeQuery = true)
    public Iterable<Carrera> Carrera(
            @Param("iduniversidad") int iduniversidad
    );
}
