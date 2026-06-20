package com.example.ms_equipoTEST.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipoResponseDTO {

    private Long id;
    private String nombre;
    private String tipo;
    private String estado;

}
