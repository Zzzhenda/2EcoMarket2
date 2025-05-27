package com.ecomarket1.ecomarkett.ventas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Table;
@Data
@Table(name = "ventas")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Venta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
    private long usuarioId;
	private String producto;
	private int cantidad;
	private double total;
}
