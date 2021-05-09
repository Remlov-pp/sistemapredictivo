package com.dagama.proeduca.repositorio;

import com.dagama.proeduca.entidades.Sedexusuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SedexusuarioRepositorio extends CrudRepository<Sedexusuario, Long> {
    @Query(value="call ConsultaSedexUsuario(:idusuario)", nativeQuery = true)
    public Iterable<Sedexusuario> SedeUsuario(
            @Param("idusuario") int idusuario);
}
