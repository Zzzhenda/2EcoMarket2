package com.ecomarket1.ecomarkett.usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecomarket1.ecomarkett.usuarios.dto.LoginRequest;
import com.ecomarket1.ecomarkett.usuarios.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {

    
    private AuthService authService;
    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        boolean authenticated = authService.login(loginRequest);
        if (authenticated) {
            //responseEntity = respuestas
            return ResponseEntity.ok("Login exitoso");
        } else {
            return ResponseEntity.status(401).body("Email o clave incorrecta");
        }
    }


    


}
