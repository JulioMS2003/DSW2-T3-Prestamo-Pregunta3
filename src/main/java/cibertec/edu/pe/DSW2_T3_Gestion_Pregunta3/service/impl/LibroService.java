package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.impl;

import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.Libro;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.repository.LibroRepository;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.interfaces.ILibroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LibroService implements ILibroService {

    private final LibroRepository libroRepository;

    @Override
    public Libro obtenerLibroXId(Long id) {
        return libroRepository.findById(id).orElse(null);
    }
}
