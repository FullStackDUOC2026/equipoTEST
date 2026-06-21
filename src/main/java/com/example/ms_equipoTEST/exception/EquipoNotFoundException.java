package com.example.ms_equipoTEST.exception;

public class EquipoNotFoundException extends RuntimeException {

    public EquipoNotFoundException(Long id) {
        super("No se encontro el equipo con id: " + id);
    }
}
