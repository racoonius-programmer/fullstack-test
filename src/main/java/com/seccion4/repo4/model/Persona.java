package com.seccion4.repo4.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // getters y setters
@NoArgsConstructor // constructor vacio
@AllArgsConstructor // constructor sobrecargado

public class Persona {
    private int id; // en desarrollo web se suele tener un ID por conveniencia/seguridad
    private String rut;
    private String nombre;
    private String apellido;
    private int edad;

}
