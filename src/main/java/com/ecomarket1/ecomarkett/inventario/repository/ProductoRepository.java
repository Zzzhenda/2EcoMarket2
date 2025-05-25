package com.ecomarket1.ecomarkett.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomarket1.ecomarkett.inventario.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}
