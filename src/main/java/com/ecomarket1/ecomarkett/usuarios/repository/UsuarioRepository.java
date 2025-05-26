package com.ecomarket1.ecomarkett.usuarios.repository;
import com.ecomarket1.ecomarkett.usuarios.model.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //metodo para la autenticacion
    Optional<Usuario> findByEmail(String email);
    
}
 
