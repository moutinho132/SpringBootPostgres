package com.practica.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "persona")
@Data
public class Persona implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @OneToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
