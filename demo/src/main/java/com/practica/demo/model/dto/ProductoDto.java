package com.practica.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoDto {
    private Long id;
    private String nombre;
    private String descripcion;
    private VendedorDto vendedor;
}
