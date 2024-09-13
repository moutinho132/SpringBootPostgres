package com.practica.demo.model.dto;

import com.practica.demo.model.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PrecioDto {
    private Long id;
    private Producto producto;
    private Double valor;
    private Date fechaInicio;
    private Date fechaFin;
}
