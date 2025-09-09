package com.SAFE_Rescue.API_Configuraciones.repository;

import com.SAFE_Rescue.API_Configuraciones.modelo.Foto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repositorio para la gestión de Fotos
 * Maneja operaciones CRUD desde la base de datos usando Jakarta
 */
@Repository
public interface FotoRepository extends JpaRepository<Foto, Integer> {
    List<Foto> findByUrl(String url);

}
