package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.impl;

import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.Miembro;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.repository.MiembroRepository;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.interfaces.IMiembroService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MiembroService implements IMiembroService {

    private final MiembroRepository miembroRepository;

    @Override
    public Miembro obtenerMiembroXId(Long id) {
        return miembroRepository.findById(id).orElse(null);
    }
}
