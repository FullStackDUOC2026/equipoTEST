package com.example.ms_equipoTEST.mapper;

import com.example.ms_equipoTEST.dto.EquipoRequestDTO;
import com.example.ms_equipoTEST.dto.EquipoResponseDTO;
import com.example.ms_equipoTEST.model.Equipo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")

public interface EquipoMapper {
    Equipo toEquipo(EquipoRequestDTO request);
    EquipoResponseDTO toResponseDTO(Equipo equipo);
    List<EquipoResponseDTO> toListResponseDTO(List<Equipo> listaEquipos);
}
