package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.impl;

import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.dto.DtoPrestamo;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.DetallePrestamo;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.Libro;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.Miembro;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.Prestamo;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.repository.DetallePrestamoRepository;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.repository.MiembroRepository;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.repository.PrestamoRepository;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.interfaces.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class PrestamoService implements IPrestamoService {

    private final PrestamoRepository prestamoRepository;
    private final DetallePrestamoRepository detallePrestamoRepository;
    private final LibroService libroService;
    private final MiembroService miembroService;

    @Transactional
    @Override
    public Prestamo realizarPrestamo(DtoPrestamo dtoPrestamo) {
        Libro libro = libroService.obtenerLibroXId(dtoPrestamo.getIdlibro());
        Miembro miembro = miembroService.obtenerMiembroXId(dtoPrestamo.getIdlibro());
        if (libro == null){
            return null;
        }else {
            Prestamo prestamo = new Prestamo();
            prestamo.setMiembro(miembro);
            prestamo.setLibro(libro);
            prestamo.setFecha_prestamo(LocalDateTime.now());
            prestamo.setMotivo(dtoPrestamo.getMotivo());
            Prestamo p = prestamoRepository.save(prestamo);

            DetallePrestamo detallePrestamo = new DetallePrestamo();
            detallePrestamo.setPrestamo(p);
            detallePrestamo.setIdlibro(libro);

            detallePrestamoRepository.save(detallePrestamo);

            return p;
        }
    }

}
