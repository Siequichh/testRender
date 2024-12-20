package com.siequichh.demorender.service;

import com.siequichh.demorender.dao.PersonaDAO;
import com.siequichh.demorender.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {
    @Autowired
    private PersonaDAO personaDAO;
    @Override
    public List<Persona> getAllPersonas() {
        return personaDAO.findAll();
    }
    @Override
    public List<Persona> searchPersonaByNombre(String nombre) {
        return personaDAO.findByNombreContaining(nombre);
    }
}
