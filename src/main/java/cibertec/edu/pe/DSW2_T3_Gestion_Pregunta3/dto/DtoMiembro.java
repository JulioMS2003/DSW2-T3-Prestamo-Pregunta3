package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DtoMiembro {

    private Integer id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String fechanacimiento;

}
