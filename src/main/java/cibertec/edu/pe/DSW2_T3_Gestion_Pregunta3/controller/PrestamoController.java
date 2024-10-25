package cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.controller;

import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.dto.DtoPrestamo;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.model.Prestamo;
import cibertec.edu.pe.DSW2_T3_Gestion_Pregunta3.service.interfaces.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/prestamo")
public class PrestamoController {

private final IPrestamoService iPrestamoService;

    @PostMapping()
    public ResponseEntity<Prestamo> realizarPrestamo(@RequestBody DtoPrestamo dtoPrestamo){
        Prestamo prestamo = iPrestamoService.realizarPrestamo(dtoPrestamo);
        return ResponseEntity.ok(prestamo);
    }

}
