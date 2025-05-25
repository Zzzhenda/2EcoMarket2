package com.ecomarket1.ecomarkett.usuarios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecomarket1.ecomarkett.usuarios.model.Usuario;
import com.ecomarket1.ecomarkett.usuarios.repository.UsuarioRepository;

@Service

public class UsuarioService {
    
    
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios() {
        // Llama al método findAll del repositorio para obtener todos los usuarios
        // de la base de datos y devuelve la lista de usuarios
        return usuarioRepository.findAll();
    }
    public Optional<Usuario> getUsuarioById(Long id) {
        // Llama al método findById del repositorio para obtener un usuario por su ID
        // y devuelve el usuario envuelto en un Optional
        return usuarioRepository.findById(id);
    }
    public Usuario createUsuario(Usuario usuario) {
        // Llama al método save del repositorio para guardar un nuevo usuario
        // en la base de datos y devuelve el usuario guardado
        return usuarioRepository.save(usuario);
    }
    public void eliminarUsuario(Long id) {
        // Llama al método deleteById del repositorio para eliminar un usuario
        // por su ID de la base de datos
        usuarioRepository.deleteById(id);
    }

}
