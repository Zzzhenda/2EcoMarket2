package com.ecomarket1.ecomarkett.usuarios.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import com.ecomarket1.ecomarkett.usuarios.service.UsuarioService;
import com.ecomarket1.ecomarkett.usuarios.model.Usuario;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @GetMapping
    public List<Usuario> getAllUsuarios() {
        // Llama al método getAllUsuarios del servicio para obtener todos los usuarios
        // de la base de datos y devuelve la lista de usuarios
        return usuarioService.getAllUsuarios();
    }
    @GetMapping("/{id}")
    public Usuario getUsuarioById(@PathVariable Long id) {
        
        return usuarioService.getUsuarioById(id).orElse(null);
    }
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        // Llama al método createUsuario del servicio para guardar un nuevo usuario
        // en la base de datos y devuelve el usuario guardado
        return usuarioService.createUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id) {
        // Llama al método eliminarUsuario del servicio para eliminar un usuario
        // por su ID de la base de datos
        usuarioService.eliminarUsuario(id);
    }
}
