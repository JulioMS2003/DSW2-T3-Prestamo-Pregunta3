package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.impl;

import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.DetallePrestamo;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.repository.DetallePrestamoRepository;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.interfaces.IDetallePrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DetallePrestamoService implements IDetallePrestamoService {

    private final DetallePrestamoRepository detallePrestamoRepository;

    @Override
    public DetallePrestamo obtenerDetallePrestamoXId(Long id) {
        return detallePrestamoRepository.findById(id).orElse(null);
    }
}
