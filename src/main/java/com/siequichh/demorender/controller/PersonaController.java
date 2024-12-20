package com.siequichh.demorender.controller;

import com.siequichh.demorender.entity.Persona;
import com.siequichh.demorender.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/")
    public String personas(Model model) {
        List<Persona> personas = personaService.getAllPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }

    @GetMapping("/new")
    public String nuevaPersona(Model model) {
        return "form";
    }
    @PostMapping("/search")
    public String buscarPersona(Model model, @RequestParam("nombre") String nombre) {
        List<Persona> personas = personaService.searchPersonaByNombre(nombre);
        model.addAttribute("personas", personas);
        return "form";
    }

}
