package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Setter
@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "idmiembro")
    private Miembro miembro;

    @ManyToOne
    @JoinColumn(name = "idlibro")
    private Libro libro;

    private LocalDateTime fecha_prestamo = LocalDateTime.now();
    private Date fecha_devolucion;
    private String motivo;

}
