package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "detalleprestamo")
public class DetallePrestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idprestamo")
    private Prestamo prestamo;

    @ManyToOne
    @JoinColumn(name = "idlibro")
    private Libro idlibro;

    private String instrucciones;

}
