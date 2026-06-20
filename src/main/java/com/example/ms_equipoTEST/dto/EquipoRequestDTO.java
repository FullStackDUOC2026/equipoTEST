package com.example.ms_equipoTEST.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EquipoRequestDTO {

    @NotBlank
    private String nombre;
    @NotBlank
    private String tipo;
    @NotBlank
    private String estado;

}
