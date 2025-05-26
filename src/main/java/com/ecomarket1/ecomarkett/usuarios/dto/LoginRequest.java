package com.ecomarket1.ecomarkett.usuarios.dto;
// D T O = DATA TRANSFER OBJECT. OBJETO PARA LOGIN

import lombok.Data;

@Data
public class LoginRequest {
        private String email;
        private String clave;
    }
