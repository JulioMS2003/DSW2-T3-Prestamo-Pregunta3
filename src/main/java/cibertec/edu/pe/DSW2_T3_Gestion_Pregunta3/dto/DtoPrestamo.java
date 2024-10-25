package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class DtoPrestamo {

    private Long idmiembro;
    private Long idlibro;
    private Date fecha_prestamo;
    private Date fecha_devolucion;
    private String motivo;

}
