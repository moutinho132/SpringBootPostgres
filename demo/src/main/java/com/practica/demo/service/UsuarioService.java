package com.practica.demo.service;

import com.practica.demo.model.dto.UsuarioDto;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<UsuarioDto> ObtenerListadoUsuarios();

    UsuarioDto createUsuario(UsuarioDto usuarioDto);

    Optional<UsuarioDto> getUsuarioById(Long id);

    UsuarioDto updateUsuario(Long id, UsuarioDto usuarioDetailsDto);

    void deleteUsuario(Long id);
}
