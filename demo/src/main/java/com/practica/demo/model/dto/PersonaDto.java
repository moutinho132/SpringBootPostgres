package com.practica.demo.model.dto;

import com.practica.demo.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PersonaDto {
    private Long id;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Usuario usuario;
}
