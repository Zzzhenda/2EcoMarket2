package com.ecomarket1.ecomarkett.usuarios.service;

import org.springframework.stereotype.Service;
import java.util.Optional;
import com.ecomarket1.ecomarkett.usuarios.dto.LoginRequest;
import com.ecomarket1.ecomarkett.usuarios.model.Usuario;
import com.ecomarket1.ecomarkett.usuarios.repository.UsuarioRepository;

@Service
public class AuthService {

    private final UsuarioRepository usuarioRepository;

    public AuthService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public boolean login(LoginRequest loginRequest) {
        Optional<Usuario> optUsuario = usuarioRepository.findByEmail(loginRequest.getEmail());

        if (optUsuario.isPresent()) {
            Usuario usuario = optUsuario.get();
            return usuario.getClave().equals(loginRequest.getClave());
        } else {
            return false;
        }
    }
}
