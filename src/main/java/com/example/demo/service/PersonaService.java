package com.example.demo.service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    public PersonaRepository personaRepository;

    @Override
    public List<Persona> verPersonas() {
        return personaRepository.findAll();
    }

    @Override
    public void crearPersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void borrarPersona(Long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return personaRepository.findById(id).orElse(new Persona());
    }
}
