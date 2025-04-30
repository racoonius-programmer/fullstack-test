package com.seccion4.repo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.repo4.model.Persona;

@Repository
public class PersonaRepository {
    private List<Persona> personas = new ArrayList<>();

    PersonaRepository() {
        personas.add(new Persona(1, "39213201-4", "Matias", "Arancibia", 21));
        personas.add(new Persona(2, "15678923-5", "Camila", "Gonzalez", 25));
        personas.add(new Persona(3, "23456789-6", "Javier", "Martinez", 30));
        personas.add(new Persona(4, "34567890-7", "Fernanda", "Lopez", 28));
        personas.add(new Persona(5, "45678901-8", "Diego", "Silva", 35));
    }

    public Persona create(Persona persona) {
        personas.add(persona);
        System.out.println(personas.toString());
        return persona;
    }

    public List<Persona> readAll() {
        return personas;
    }

}
