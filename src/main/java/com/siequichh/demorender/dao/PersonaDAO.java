package com.siequichh.demorender.dao;

import com.siequichh.demorender.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaDAO extends JpaRepository<Persona, String> {
    List<Persona> findByNombreContaining(String nombre);
}
