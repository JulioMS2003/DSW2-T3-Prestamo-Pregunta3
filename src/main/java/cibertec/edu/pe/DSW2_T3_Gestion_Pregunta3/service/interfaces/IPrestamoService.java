package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.interfaces;

import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.dto.DtoPrestamo;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.Prestamo;

public interface IPrestamoService {

    Prestamo realizarPrestamo(DtoPrestamo dtoPrestamo);

}
