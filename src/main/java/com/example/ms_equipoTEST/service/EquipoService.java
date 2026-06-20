package com.example.ms_equipoTEST.service;

import com.example.ms_equipoTEST.dto.EquipoRequestDTO;
import com.example.ms_equipoTEST.dto.EquipoResponseDTO;
import com.example.ms_equipoTEST.mapper.EquipoMapper;
import com.example.ms_equipoTEST.model.Equipo;
import com.example.ms_equipoTEST.repository.EquipoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipoService {
    private final EquipoRepository equipoRepository;
    private final EquipoMapper mapper;


    public EquipoResponseDTO crearEquipo(EquipoRequestDTO request) {
        Equipo varEquipoDB = equipoRepository.save(mapper.toEquipo(request));
        return mapper.toResponseDTO(varEquipoDB);
    }

    public List<EquipoResponseDTO> listarEquipos(){
        return mapper.toListResponseDTO(equipoRepository.findAll());
    }
    public EquipoResponseDTO listarPorId(Long id){
        Equipo equipo = equipoRepository.findById(id).orElseThrow(()-> new RuntimeException("No se encontro el equipo"));
        return mapper.toResponseDTO(equipo);
    }


}
