package com.ecomarket1.ecomarkett.ventas.service;

import java.util.List;
import com.ecomarket1.ecomarkett.ventas.model.Venta;
import com.ecomarket1.ecomarkett.ventas.repository.VentaRepository;

import org.springframework.stereotype.Service;

@Service

public class VentaService {

    private final VentaRepository ventaRepository;
    public VentaService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }
    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }
    public Venta getVentaById(Long id) {
        return ventaRepository.findById(id).orElse(null);
    }
    public Venta createVenta(Venta venta) {
        return ventaRepository.save(venta);
    }
    public Venta updateVenta(Long id, Venta venta) {
        if (ventaRepository.existsById(id)) {
            venta.setId(id);
            return ventaRepository.save(venta);
        }
        return null;
    }
    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }
    

}
