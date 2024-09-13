package com.practica.demo.service;

import com.practica.demo.model.Usuario;
import com.practica.demo.model.dto.UsuarioDto;
import com.practica.demo.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository repository;

    private UsuarioDto convertToDto(Usuario usuario) {
        return UsuarioDto.builder()
                .id(usuario.getId())
                .username(usuario.getUsername())
                .password(usuario.getPassword())
                .email(usuario.getEmail())
                .build();
    }

    private Usuario convertToEntity(UsuarioDto usuarioDto) {
        return Usuario.builder()
                .id(usuarioDto.getId())
                .username(usuarioDto.getUsername())
                .password(usuarioDto.getPassword())
                .email(usuarioDto.getEmail())
                .build();
    }

    public List<UsuarioDto> ObtenerListadoUsuarios(){
      return repository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    // Método para crear un nuevo usuario (DTO)
    public UsuarioDto createUsuario(UsuarioDto usuarioDto) {
        Usuario usuario = convertToEntity(usuarioDto);
        Usuario savedUsuario = repository.save(usuario);
        return convertToDto(savedUsuario);
    }

    // Método para obtener un usuario por su ID (retorna un DTO)
    public Optional<UsuarioDto> getUsuarioById(Long id) {
        return repository.findById(id)
                .map(this::convertToDto);
    }

    public UsuarioDto updateUsuario(Long id, UsuarioDto usuarioDetailsDto) {
        return repository.findById(id).map(usuario -> {
            usuario.setUsername(usuarioDetailsDto.getUsername());
            usuario.setPassword(usuarioDetailsDto.getPassword());
            usuario.setEmail(usuarioDetailsDto.getEmail());
            Usuario updatedUsuario = repository.save(usuario);
            return convertToDto(updatedUsuario);
        }).orElseThrow(() -> new RuntimeException("Usuario no encontrado con el ID: " + id));
    }

    // Método para eliminar un usuario por su ID
    public void deleteUsuario(Long id) {
        repository.deleteById(id);
    }

}
