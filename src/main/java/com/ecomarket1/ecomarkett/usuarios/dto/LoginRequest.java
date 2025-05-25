package com.ecomarket1.ecomarkett.usuarios.dto;
//clase simple que solo tiene los datos que quieres recibir o enviar en una petición.

import lombok.Data;

@Data
public class LoginRequest {
        private String email;
        private String clave;
    }
