package com.practica.demo.model.dto;

import com.practica.demo.model.Persona;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VendedorDto {
    private Long id;
    private Persona persona;
    private RolDto rol;
}
