package com.seccion4.repo4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seccion4.repo4.model.Persona;
import com.seccion4.repo4.repository.PersonaRepository;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Persona guardarPersona(Persona persona) {
        return personaRepository.create(persona);
    }

    public List<Persona> listarPersonas() {
        return personaRepository.readAll();
    }

    public Persona buscarxId(int id){
        System.out.println("por id");
        return personaRepository.read(id);
    }

    public Persona buscarxRut(String rut){
        System.out.println("por rut");
        return personaRepository.readxRut(rut);
    }

    public Persona modificar(int id, Persona persona)
    {
        return personaRepository.update(id, persona);
    }

    public String borrar(int id) {
        return personaRepository.delete(id);
    }
}
